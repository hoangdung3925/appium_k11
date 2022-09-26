package Lesson_06;

public class Lab_6_4 {
    public static void main(String[] args) {

        String url = "https://google.com";
        String domainName = url.substring(8);
        String myUrl = url.substring(15);

        if (myUrl.indexOf("c") < 0) {
            System.out.println(".net");
        } else System.out.println(".com");

        if (url.indexOf("s") < 0) {
            System.out.println("http");
        } else System.out.println("https");
        System.out.println("Domain name: " + domainName);
    }
}