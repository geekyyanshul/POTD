package November2024;
     

//AN hello world program that takes the user's name as input and prints "Hello, <name>!".

import java.util.Scanner;


public class hellonovember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
    
}
