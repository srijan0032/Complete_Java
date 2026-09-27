abstract class Parent{
    public Parent(){
        System.out.println("Hi! I'm constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}

class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet1(){
        System.out.println("Good afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I'm good");
    }
}

public class Abstraction {
    public static void main(String[] args) {
            //Parent p = new Parent(); --> errror
            Child1 c1 = new Child1();
            //Child2 c2 = new Child2(); --> error    
    }
}
