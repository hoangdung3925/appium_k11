package Lesson_06;
import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {

        int max = 0;
        String myPassword = "password123";

        while (max <3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào mật khẩu");
            String userPW = scanner.nextLine();

            if (userPW.equals(myPassword)) {
                System.out.println("Bạn đã nhập đúng mật khẩu!");
                break;
            }
            else max++;
        }
    }
}
