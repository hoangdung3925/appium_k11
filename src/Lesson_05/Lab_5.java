package Lesson_05;
import java.util.*;

public class Lab_5 {
    public static void main(String[] args) {

        boolean isContinuing = true;
        Map<Integer, String> studentList = new HashMap<>();
        Set<Integer> stuIDSet = studentList.keySet();
        ArrayList<Integer> stuIDList= new ArrayList<>();
        stuIDList.addAll(stuIDSet);

        while (isContinuing) {
            System.out.println("==========MENU=======");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Option number, please: ");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                isContinuing = false;
            } else {
                switch (userInput) {
                    case 1:
                        System.out.println("Input student ID, please!");
                        int stuID = scanner.nextInt();
                        System.out.println("Input student name, please!");
                        String stuName = scanner.nextLine();

                        studentList.put(stuID, stuName);
                        break;

                    case 2:
                        System.out.println("Input student ID you want to find, please!");
                        int stuIDFind = scanner.nextInt();
                        for (int i = 0; i < stuIDList.size(); i++) {
                            if (stuIDList.get(i) == stuIDFind){
                                System.out.println("Student ID: " + stuIDFind);
                                System.out.println("Student name: " + studentList.get(stuIDFind));
                            }
                            else{
                                System.out.printf("Student with %d not found", stuIDFind);
                            }
                        }
                }

            }
        }
    }
}