package Lesson_03;

public class Lab_3_1 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int i = 0; i < 10; i++) {
            if (arrayInt[i] % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("evenNumbers: " + evenNumbers);
        System.out.println("oddNumbers: " + oddNumbers);
    }
}