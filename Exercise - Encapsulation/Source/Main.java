import java.util.Scanner;

import Encapsulation.Car;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the car color: ");
        String color = input.nextLine();

        System.out.print("Enter the car price: ");
        double price = input.nextDouble();

        System.out.print("Enter the car size(s, m or l): ");
        char size = input.next().charAt(0);

        Car useCar = new Car(color, price, size);

        System.out.println("\nCar Details:");
        System.out.println("Color: " + useCar.getColor());
        System.out.println("Price: P" + String.format("%.2f", useCar.getPrice()));
        System.out.println("Size: " + useCar.getSize());

        System.out.println("\nFormatted output: " + useCar.toString());

        input.close();
    }
}
