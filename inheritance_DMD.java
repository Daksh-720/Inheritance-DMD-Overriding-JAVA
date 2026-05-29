//inheritance_Dynamic-Method-Dispatch_overriding//



class Animal {
    void sound(){
        System.out.print("This is parent class Animal");
    }   
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog bark's");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meow's");
    }
}


public class inheritance_DMD {
    public static void main(String[] args){

        Animal A;
        A = new Dog();
        A.sound();

        A = new Cat();
        A.sound();
    }    
}
