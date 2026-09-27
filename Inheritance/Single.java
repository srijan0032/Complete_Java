package Inheritance;

class Animal{
    private String name;

    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void eat(){
        System.out.println("Animal eats food");
    }

    public void sayHello(){
        System.out.println(" ");
    }
}

class Dog extends Animal{
    public void sayHello(){ //--> Method Overriding
        System.out.println(" Woof");
    }
}

//3- Hierarchical Inheritance
class Cat extends Animal{
    public void sayHello(){ //--> Method Overriding
        System.out.println(" Woof");
    }
}

public class Single{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(2);
        d.setName("Bob");
        d.eat();
        d.sayHello();
    }
}
