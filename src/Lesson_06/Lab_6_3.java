package Lesson_06;

public class Lab_6_3 {
    public static void main(String[] args) {

        String myStr = "100 minutes";
        String number = myStr.substring(0,3);
        int num = Integer.parseInt(number);

        System.out.printf("Output: %d", num);
    }
}
