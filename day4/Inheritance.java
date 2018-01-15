
public class Inheritance {
	public static void main(String[] args) {
		Animal a = new Animal("Sunny", 3);
		System.out.println("Animal named " + a.getName() + " created and is " + a.getAge() + " years old");
		
		Dog d = new Dog("Cher", 4, "Russel Terrier Poodle");
		System.out.println("Dog named " + d.getName() + " created and is " + d.getAge() + " years old");
		
		Husky h = new Husky("Ava", 6);
		System.out.println("Husky named " + h.getName() + " created and is " + h.getAge() + " years old");
		GermanShepherd g = new GermanShepherd("Rocky", 4);
		System.out.println("German Shepherd named " + g.getName() + " created and is " + g.getAge() + " years old");
		Poodle p = new Poodle("Annie", 8);
		System.out.println("Poodle named " + p.getName() + " created and is " + p.getAge() + " years old");
		
		Dog huskypoodle = Dog.breed(h, p, "Rex");
		System.out.println("Dog named " + huskypoodle.getName() + " created and is " + huskypoodle.getAge() + " years old");
	}
}

class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}

class Dog extends Animal {
	private String breed;
	boolean pureBred;
	
	public Dog(String name, int age, String breed) {
		
		super(name, age);
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public static Dog breed(Dog father, Dog mother, String name) {
		Dog child = new Dog(name, 0, father.getBreed() + " " + mother.getBreed());
		child.pureBred = false;
		System.out.println("Congratulations! " + child.getName() + " has been bred with breed " + child.getBreed());
		return child;
	}
}

class Husky extends Dog {
	
	public Husky(String name, int age) {
		super(name, age, "Husky");
		super.pureBred = true;
	}
}

class GermanShepherd extends Dog {
	
	public GermanShepherd(String name, int age) {
		super(name, age, "German Shephed");
		super.pureBred = true;
	}
}

class Poodle extends Dog {
	
	public Poodle(String name, int age) {
		super(name, age, "Poodle");
		super.pureBred = true;
	}
}