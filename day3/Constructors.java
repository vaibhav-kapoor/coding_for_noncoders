class Car {
    String make;
    int mileage;
    
    /*public Car() {
        this.make = "No make";
        this.mileage = 0;
    }*/
    
    public Car(String make, int mileage) {
        this.make = make;
        this.mileage = mileage;
    }
    
    public Car(String make) {
        this(make, 0);
    }
    public Car(int mileage) {
        this("No Make", mileage);
    }
    public Car() {
        this("No Make", 0);
    }
    
    public String toString() {
        return "The car's make is: " + this.make + ", with mileage: " + mileage;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public int getMileage() {
        return this.mileage;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.toString());
        
        Car c2 = new Car("Honda", 145666);
        System.out.println(c2.getMake());
        System.out.println(c2.getMileage());
        System.out.println(c2);
        
        Car c3 = new Car("Honda");
        System.out.println(c3);
        c3.setMileage(145666);
        System.out.println(c3);
        
        Car c4 = new Car(145666);
        System.out.println(c4);
        c4.setMake("Mazda");
        System.out.println(c4);
    }
}