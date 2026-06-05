
import java.util.Scanner;

public class switchex{
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 1st Number: ");

        a = scanner.nextInt();

        System.err.println("Enter a 2nd Number: ");

        b = scanner.nextInt();

        System.out.println("Enter a Operator +, -, *, /, % : ");

        char operator = scanner.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println(a + " + " + b + " = " +  (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " +  (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " +  (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " +  (a / b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " +  (a % b));
                break;
            default:
                System.out.println("Invalid Operator ");
        }
    }
}