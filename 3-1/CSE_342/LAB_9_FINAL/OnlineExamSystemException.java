
class TimeLimitExceededException extends Exception {

    public TimeLimitExceededException(String message) {
        super(message);
    }
}

class ExamSystem {

    public void submitExam(int timeSpentMinutes, int allowedTimeMinutes) throws TimeLimitExceededException {
        if (timeSpentMinutes > allowedTimeMinutes) {
            throw new TimeLimitExceededException("Submission Rejected: Time limit has expired.");
        }
        System.out.println("Submission Successful! Assessment accepted within the scheduled window.");
    }
}

public class OnlineExamSystemException {

    public static void main(String[] args) {
        ExamSystem system = new ExamSystem();

        try {
            System.out.println("Attempting submission at 45 minutes (Limit: 60 minutes):");
            system.submitExam(45, 60);
        } catch (TimeLimitExceededException e) {
            System.err.println(e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("Attempting submission at 65 minutes (Limit: 60 minutes):");
            system.submitExam(65, 60);
        } catch (TimeLimitExceededException e) {
            System.err.println(e.getMessage());
        }
    }
}
