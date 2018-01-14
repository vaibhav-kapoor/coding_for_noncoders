import java.util.*;
public class WhileLoops {
    public static void main(String [] args) {
        int x = 0;
        while (x <= 3) {
            System.out.println("x is: " + x);
            x = x + 1;
        }
        
        x = 0;
        while (true) {
            System.out.println("Hopefully this won't last forever!");
            x += 1;
            if (x == 100) {
                break;
            }
        }
        Scanner scan = new Scanner(System.in);
        int input = 0;
        while (input != 666) {
            System.out.println("Enter a line:");
            input = scan.nextInt();
            System.out.println("You entered: " + input);
        }
        System.out.println("Program has finished running!");
    }
}