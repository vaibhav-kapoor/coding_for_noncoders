import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        System.out.println("This is going to output into the terminal");
        
        System.out.println("Please enter some text: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("You wrote: " + input);
        
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println(name + " is " + age + " years old!");
    }
}