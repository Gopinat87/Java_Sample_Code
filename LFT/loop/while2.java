
import java.util.Scanner;

public class while2{
   public static void main(String[] args) {
       double n , sum = 0.0;

       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter a positive numbers to add them:  /n if you want to stop to enter a negative number: ");

       while(true){
        n = scanner.nextDouble();
        
        if(n > 0.0  ){
            sum = sum + n;
        }
        else {
            break;
        }
       }
        System.out.println("Sum of you entered numbers is "+ sum);
   }
}