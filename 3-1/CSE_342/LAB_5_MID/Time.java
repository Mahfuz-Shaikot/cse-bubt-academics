
public class Time {

    private int hours;
    private int minutes;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
    }

    public Time(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public boolean equals(Time other) {
        if (other == null) {
            return false;
        }
        return this.hours == other.hours && this.minutes == other.minutes;
    }

    public void display() {
        System.out.printf("%02d:%02d%n", hours, minutes);
    }
}

class MainTime {

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(14, 30);
        Time t3 = new Time(14, 30);

        t1.setHours(9);
        t1.setMinutes(15);

        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();
        System.out.print("Time 3: ");
        t3.display();

        System.out.println("Time 1 equals Time 2: " + t1.equals(t2));
        System.out.println("Time 2 equals Time 3: " + t2.equals(t3));
    }
}
