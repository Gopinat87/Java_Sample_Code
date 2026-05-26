
import java.util.Scanner;

public class get_input{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Getinput and Store that

        System.out.println("Enter Your name: ");
         
        String name = scanner.nextLine();  // to store string

        System.out.println("Give me your Rating 1 to 10: ");

        int rating = scanner.nextInt(); // to store integers

        System.out.println("Hello " + name);
        
        System.err.println("Your given rating is " + rating);
    }
}


