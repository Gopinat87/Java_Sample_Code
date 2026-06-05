public class arr{
    public static void main(String[] args) {


        int a[] ;
        a = new int[10]; // array declare 1 dimensional array
        a[2] = 3; 
        a[1] = 2;
        a[0] = 1; // assign single value
        System.out.println(a[3]);  // to get values


        int num[] = {1,2,3,4,5,6};  // assign multiple values without assign total length
        System.out.println(num[4]);

        int marks[][] = new int[4][3];  // 2 dimensional array 

        marks[0][1] = 39;

        float[][] dec = new float[4][];
        dec[0] = new float[10];
        dec[1] = new float[20];
        dec[2] = new float[21];
        dec[3] = new float[19];

        dec[0][0] = 32 ;
        dec[3][0] = 87;
        System.out.println(dec[0][0]);
        System.out.println(dec[3][0]);

        int z[][] = {
                    {1,2,3,4,5},
                    {1,2,3,4,5},
                    {1,2,3,4}
        };
        System.out.println(z[2][3]);

        int dr[][] = new int[3][];
        dr[1] = new int [4];
        dr[0] = new int [4];


    }
}

