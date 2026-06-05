public class forloop{
    public static void main(String[] args) {
        for(int i=1;i<=4; i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.err.print(" * ");
            }

            System.err.println();
        }

        for (int a =1;a<=6;a++)
        {
            for ( int b = 1; b <= a ; b++)
            {
                System.err.print("*");
            }
            System.err.println();
        }

        int g;
        g = 5;
        while(g<= 10){
            System.err.println("Gopinath");
            g = g+1;
        }

        int h = 1;
        do { 
            System.out.println("Welcome");
            h++;
        } while (h<= 3);
    }
}

