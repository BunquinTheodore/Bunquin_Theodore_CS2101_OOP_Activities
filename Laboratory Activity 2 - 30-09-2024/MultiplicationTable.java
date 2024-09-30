import java.util.Scanner;

public class MultiplicationTable {

    public static void generateMultiplicationTable(int size) {
        int[][] table = new int[size][size];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }

        System.out.println("Multiplication Table:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", table[i - 1][j - 1]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        generateMultiplicationTable(size);

        scanner.close();
    }
}
