class encap{
    private String name = "Daksh";
    private int age = 18;

    public int getAge(){
        return age;                     //in this public method is defined within private class
    };                                  // hence private class can be accessed only by the methods defined within the same private class;

    public String getName(){
        return name;
    };
}






public class encapsulation {
    public static void main(String[] args){
        encap e = new encap();
        System.out.print(e.getName() + ":" + " " + e.getAge());
    }
}
