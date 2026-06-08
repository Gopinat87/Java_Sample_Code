

class games {
    int ar;
    int smg;
    int sg;

    void total (int a , int s, int g){
        ar = a;
        smg = s;
        sg = g;
    }
    int total_guns(){ // create method in class of object 
        return ar+smg+sg;
    }
}

public class m2{
    public static void main(String[] args) {
        games free_fire = new games(); // create object 

        free_fire.total(10,7,9);
        // free_fire.ar = 10;
        // free_fire.smg = 7;
        // free_fire.sg = 8;
        
        System.out.println("Total Guns in Free fire " + free_fire.total_guns()); // method invoke

        games pubg = new games();

        pubg.ar = 15;
        pubg.smg = 12;
        pubg.sg = 8;

        System.out.println("Total guns in PUBG " + pubg.total_guns());

    }
}