
import java.util.Scanner;

public class whileloop{
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter a number: ");
        n = scanner.nextInt();


        while(true){
            if(n%10 == 0){
                System.err.println(n);
                break;
            }
            n--;
        }

    }
}
