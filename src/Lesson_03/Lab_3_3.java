package Lesson_03;

public class Lab_3_3 {

    public static void main(String[] args) {
        int[] arrayInt = new int[]{10, 12, 3, 4, 5, 6, 7, 8, 9, 100};
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++){
                if (arrayInt[i] > arrayInt[j]) {
                    int temp = 0;
                    temp = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = temp;
                }
            }
        }
        System.out.print("New array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}