class boxvolume{
    int length;
    int breadth;
    int height;

boxvolume(int l, int b, int h){
    length = l;
    breadth = b;
    height = h;
}

void setdimension(int l , int b, int h){
    length = l;
    breadth = b ;
    height = h ;
}

int volume(){
    return length*breadth*height;
}

}


public class cons{
    public static void main(String[] args) {
        boxvolume redbox = new boxvolume(10,5,15);
        redbox.setdimension(12, 5, 10);
        System.out.println("volume of red box is " + redbox.volume());

    }
}

