package Inheritance;

class GrandParents{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Parents extends GrandParents{

}

class Child extends Parents{

}

public class MultiLevel {
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Ram");

        Parents p = new Parents();
        p.setName("Ramesh");
        System.out.println(p.getName());
        
    }
}
