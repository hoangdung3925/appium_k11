package Lesson_06;

public class Lab_6_1 {
    public static void main(String[] args) {

        String input = "2hrs and 5 minutes";
        String hour = input.substring(0,1);
        String minutes = input.substring(9,10);

        int h = Integer.parseInt(hour);
        int m = Integer.parseInt(minutes);
        int total = h*60 + m;

        System.out.printf("Tổng thời gian là: %d",total);
    }
}
