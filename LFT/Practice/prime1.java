import java.util.Scanner;

public class prime1{
    public static void main ( String [] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = inputs.nextInt();

        boolean isprime = true;

        if(number <= 1 ) {
            isprime = false;
        }

        else {
            for (int i = 2; i < number ; i++ ){
                if (number % i == 0){
                    isprime = false;
                    break;
                }
            }
        }
        if(isprime)
            System.out.println(number + " is prime number ");
        else 
            System.out.println(number + " is not a prime number ");
    }
}