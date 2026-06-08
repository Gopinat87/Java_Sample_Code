class hostel {
    int student;
    int manager;
    int cleaner;
    int chef;

}

public class c1{
    public static void main(String[] args) {
        
        hostel grd = new hostel();

        grd.student = 40;
        grd.manager = 3;
        grd.cleaner = 2;
        grd.chef = 2 ;

        System.out.println(grd.student);
    }
}