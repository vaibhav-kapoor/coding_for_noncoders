public class Arithmetic {
    public static void main(String [] args) {
        // Adding numbers
        int x = 340000;
        int y = -1;
        int sum = x + y;
        System.out.println("The sum of x+y: " + sum);
        
        // Multiplying numbers
        x = 2;
        y = 40;
        System.out.println("x * y: " + x * y);
        
        // Dividing numbers
        int num = 258;
        int den = 125;
        System.out.println("The num/den: " + num / den);
        
        // Remainder
        System.out.println("Remainder of num/den: " + num % den);
        
        // Inrementing numbers
        int i = 1;
        System.out.println("i = " + i);
        i += 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i -= 3;
        System.out.println("i = " + i);
        i--;
        System.out.println("i = " + i);
    }
}