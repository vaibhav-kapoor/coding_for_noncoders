import java.util.*;
public class ForLoops {
    public static void main(String[] args) {
        System.out.println("Entering first loop");
        for (int i = 0; i < 10; i ++) {
            System.out.println("Program is at loop iteration: " + i);
        }
        System.out.println("Entering second loop");
        for (int i = 1; i <= 10; i ++) {
            System.out.println("Program is at loop iteration: " + i);
        }
        System.out.println("Entering third loop");
        for (int i = 1; i < 10; i++) {
            System.out.println("Program is at loop iteration: " + i);
        }
        System.out.println("Entering fourth loop");
        for (int i = 10; i > 1; i--) {
            System.out.println("Program is at loop iteration: " + i);
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times the loop will iterate");
        int loopCount = scan.nextInt();
        for (int i = 0; i < loopCount; i++) {
            System.out.println("Program is at loop iteration: " + i);
        }
    }
}