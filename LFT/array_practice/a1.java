public class a1{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,56,87};
        int sum = 0 ;
        for ( int x: a) {
            System.out.println(x);
        }

        for (int j :a) {
            sum += j ;
        }

        System.out.println(sum);
    }
}