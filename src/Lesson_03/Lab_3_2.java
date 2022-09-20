package Lesson_03;

public class Lab_3_2 {

    public static void main(String[] args) {
        int[] arrayInt = new int[]{10, 12, 3, 4, 5, 6, 7, 8, 9, 100};
        int minNumber = arrayInt[0];
        int maxNumber = arrayInt[0];
        for (int i = 0; i < 10; i++) {
            if (arrayInt[i] < minNumber) {
                minNumber = arrayInt[i];
            }
            if (arrayInt[i] > maxNumber) {
                maxNumber = arrayInt[i];
            }
        }
        System.out.println("minNumber: " + minNumber);
        System.out.println("maxNumber: " + maxNumber);
    }
}
