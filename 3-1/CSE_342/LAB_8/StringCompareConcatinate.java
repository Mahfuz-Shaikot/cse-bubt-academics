
public class StringCompareConcatinate {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "BUBTian's";

        if (!str1.equals(str2)) {
            String result = str1 + str2;
            System.out.println(result);
        } else {
            str2 = str2.replace("UBT", "");
            System.out.println(str2);
        }
    }
}
