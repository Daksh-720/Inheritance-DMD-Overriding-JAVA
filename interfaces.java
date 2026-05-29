interface Human{}

class Daksh implements Human{
    void age(){
        System.out.println("My age is 18");
    }
}



public class interfaces {
    public static void main(String[] args){
        Daksh obj = new Daksh();
        obj.age();
    }    
}
