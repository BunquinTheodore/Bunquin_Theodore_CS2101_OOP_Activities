import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        System.out.println("Welcome to CS 211: Object-Oriented Programming!");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("This course will be fun, " + name + "!");

        input.close();
    }
}
