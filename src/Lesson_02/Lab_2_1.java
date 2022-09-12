package Lesson_02;

import java.util.Scanner;

public class Lab_2_1 {
    public static void main(String [] agrs) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height(m): ");
        float height = scanner.nextFloat();

        System.out.print("Please enter your weight(kg): ");
        float weight = scanner.nextFloat();

        float BMI = weight / (height * 2);
            if (BMI <= 18.5) {
                System.out.println("You're underweight!");
            } else if (BMI > 18.5 && BMI <= 24.9) {
                System.out.println("You're normal weight!");
            } else if (BMI >= 25 && BMI <= 29.9) {
                System.out.println("You're overweight!!");
            } else {
                System.out.println("You're obesity!!!");
            }
        }
    }
