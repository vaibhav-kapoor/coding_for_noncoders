public class Expressions {
    public static void main(String[] args) {
        // Integer operators
        int x = 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x += 2;
        System.out.println(x);
        x -= 2;
        System.out.println(x);
        x = -x;
        System.out.println(x);
        x = +x;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        
        // Boolean operators
        System.out.println(x < 2);
        System.out.println(x > 1);
        System.out.println(x >= 1);
        System.out.println(x == 1);
        System.out.println(x != 2);
        System.out.println(!(x == 1));
        
        System.out.println(x < 2 && x == 1);
        System.out.println(x > 2 || x == 1);
        
        System.out.println(x*6/3+2*3);
    }
}
