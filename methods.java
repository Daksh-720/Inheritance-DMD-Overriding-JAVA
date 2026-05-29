class  Calculator {
        public int add(int n1, int n2){
            return n1 + n2;
        }

        public int add(int n1, int n2, int n3){
            return n1+n2+n3;
        }
}


//in the above class there are 2 methods with same name in Java methods can have same names
//if the number of methods using same name increases its called method overloading!!



public class methods {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        int result = calc.add(4, 5);

        System.out.print("The sum is: " + result);
    }
    
}
