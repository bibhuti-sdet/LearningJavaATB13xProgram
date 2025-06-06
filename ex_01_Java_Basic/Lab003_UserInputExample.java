package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab003_UserInputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter Age");
        int age = scanner.nextInt();
        System.out.println("Hello," + name + " You are "+ age + " years old.");
        scanner.close();
    }

}
