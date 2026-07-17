
public class ConcatinatedString {

    public static void main(String[] args) {

        String a1 = "Hello";
        String a2 = "BUBTian’s";

        if (!a1.equals(a2)) {
            String result = a1.concat(a2);
            System.out.println("Concatenated String: " + result);
        } else {
            a2 = a2.replace("UBT", "");
            System.out.println("Modified String: " + a2);
        }
    }
}
