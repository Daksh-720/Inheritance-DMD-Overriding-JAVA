interface A{
    void show();
}



public class lambda {
    public static void main(String[] args){

        A a = () ->
        {
            System.out.println("this is a Lambdaaaa");
        };
        a.show();

    }
    
}
