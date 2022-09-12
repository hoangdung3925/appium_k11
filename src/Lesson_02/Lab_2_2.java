package Lesson_02;
import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        int remainder = number % 2;

        if (remainder == 0) {
            System.out.println("Even!!!");
        } else{
            System.out.println("Odd!");
        }
    }
}