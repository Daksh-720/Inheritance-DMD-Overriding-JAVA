class A{
    void show(){
        System.out.println("In A show");
    }
}

public class anonymous {
    public static void main(String[] java){
        A a = new A(){

           //this created an anonymous class that does not have a particular classNAME//
            public void show(){
                System.out.println("In New Show");   
            }
        };
        a.show();   //----important//

    }
    
}
