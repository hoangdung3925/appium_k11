package Lesson_02;

import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String [] agr) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height(m): ");
        float height = scanner.nextFloat();

        System.out.print("Please enter your weight(kg): ");
        float weight = scanner.nextFloat();

        float BMI = weight / (height * 2);
        double normal1 = 18.5*height*2;
        double normal2 = 24.9*height*2;
        if (BMI <= 18.5) {
            System.out.println("You're underweight!");
            System.out.printf("You should gain %f(kg) to %f(kg) ^^!",normal1-weight,normal2-weight);

        } else if (BMI > 18.5 && BMI <= 24.9) {
            System.out.println("You're normal weight!");

        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("You're overweight!!");
            System.out.printf("You should lose %f(kg) to %f(kg) ^^!",weight-normal2,weight-normal1);

        } else {
            System.out.println("You're obesity!!!");
            System.out.printf("You should lose %f(kg) to %f(kg) ^^!",weight-normal2,weight-normal1);
        }
    }
}
