public class Escseq {
    public static void main(String[] args) {
        printNumbers(4);
    }

    public static void printNumbers(int count) {
        int number = 7;

        for (int i = 1; i <= count; i++) {
            if (i % 2 == 0) {

                System.out.println("\t" + number);
            } else {

                System.out.println(number);
            }
            number += 7;
        }
    }
}
