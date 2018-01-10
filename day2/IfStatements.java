import java.util.*;

public class IfStatements {
    public static void main(String[] args) {
        boolean feelLikeIt = true;
        
        if (true) {
            System.out.println("This will always print because it will always be true!");
        }
        
        if (feelLikeIt)  {
            System.out.println("I feel like it");
        }
        else {
            System.out.println("I don't feel like it");
        }
        feelLikeIt = false;
        
        if (feelLikeIt)  {
            System.out.println("I feel like it");
        }
        else {
            System.out.println("I don't feel like it");
        }
        
        int x = 4;
        int y = 2*2;
        if (x + y < 3) {
            System.out.println("x + y is less than 3");
        }
        else if ((x + y) == 8) {
            System.out.println("x + y is equal to 8");
        }
        
        Random r = new Random();
        int randomNum = r.nextInt(10);
        if (randomNum < 0) {
            System.out.println(randomNum + " - The random number is negative");
        }
        else if (randomNum > 0) {
            System.out.println(randomNum + " - The random number is positive");
        }
        else {
            System.out.println(randomNum + " - The random number is 0");
        }
    }
}