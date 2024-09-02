import java.util.Scanner; 

class GettingGreater{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting the Greater Value");

        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);
        int ascii_1 = (int) ch1;

        System.out.print("Entr second character: ");
        char ch2 = scanner.next().charAt(0);
        int ascii_2 = (int) ch2;

        char greater_char = (char) Math.max(ascii_1, ascii_2);
        
        System.out.println("------------------------------------");
        System.out.println("The character with greater value is: " + greater_char);
        System.out.println("------------------------------------");
        
        System.out.println("Showing the ASCII");
        System.out.println(ch1 + ":" + (int) ch1);
        System.out.println(ch2 + ":" + (int) ch2);
        
        scanner.close(); 
    }
}