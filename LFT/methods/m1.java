public class m1{

    // create method 
    static int boxvolume(int length, int breadth, int height){ // method header
        int vol = length*breadth*height;
        return vol;
        // System.out.println("vol is " + vol);
    }

    static void printline(){ // method without arguments
        System.out.println("-------------------");
    } 
    public static void main(String[] args) {
        
        printline();
        System.err.println("Welcome to Method"); // Method call
        // System.err.println(boxvolume(10,32,12));
        int volume = boxvolume(21, 4, 10);
        System.out.println(volume);
        printline();
    }
}