
class Dog {}

class Person {
    public String firstName;
    public/*private*/ String lastName;
    public int age;
}

class Circle {
    private int radius;
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area() {
        return this.radius * this.radius * Math.PI;
    }
}

public class SimpleObjects {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        System.out.println(d);
        
        Person p = new Person();
        p.firstName = "Bob";
        p.lastName = "Smith";
        p.age = 48;
        System.out.println(p.firstName + " " + p.lastName + " is " + p.age + " years old.");
        
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println(c.area());
        
    }
}