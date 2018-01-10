public class MethodsFunctions {
    public static void main(String[] args) {
        System.out.println(helloWorld());
        int a = 22;
        int b = 2;
        System.out.println("The sum is: " + sum(a, b));
        System.out.println("The max is: " + max(a, b));
        swapValue(a, b);
        System.out.println("Swapping using 'pass-by-value', value of a: " + a, + "value of b: "  + b);
    }
    
    public static String helloWorld() {
        return "Hello World!";
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else if (a < b) {
            return b;
        }
        else {
            return a;
        }
    }
    
    public static void swapValue(int a, int b) {
        int temp = a;
        b = a;
        a = b;
    }
    
    public static void swapString(String s1, String s2) {
        int temp = a;
        b = a;
        a = b;
    }
}