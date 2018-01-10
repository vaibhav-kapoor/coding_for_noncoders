import java.util.*;

public class StringsText {
    public static void main(String[] args) {
        char c = 'A';
        char e = '!';
        char q = 'q';
        System.out.println(c + " " + e + " " + q);
        
        String t1 = "Text1";
        String t2 = "Texttwo";
        System.out.println(t1 + " " + t2);
        
        System.out.println("String t1 has length: " + t1.length());
        System.out.println("String t2 has length: " + t2.length());
        
        String veryLongString = "This going to be quite a long string, but is a good example of the long strings can be, essentially when this is printed it will all be on line";
        System.out.println(veryLongString);
        System.out.println("The very long string has a length of: " + veryLongString.length());
        
        System.out.println("'long string' is at index: " + veryLongString.indexOf("long string"));
        
        System.out.println(veryLongString.substring(0, 5));
        String[] veryLongSplit = veryLongString.split(" ");
        System.out.println(Arrays.toString(veryLongSplit));
    }
}