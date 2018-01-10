import java.util.*;
public class ArraysExample {
    public static void main(String[] args) {
        int ar[] = new int[5];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;
        ar[4] = 5;
        //ar[5] = 6;
        System.out.println(Arrays.toString(ar));
        
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        
        int br[]= new int[] {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(br));
        
        int cr[] = {2, 5, 3, 1, 4};
        System.out.println(Arrays.toString(cr));
        
        for (int i = 0; i < cr.length; i ++) {
            cr[i] *= -2;
        }
        System.out.println(Arrays.toString(cr));
        int i = 0;
        for (int a: ar) {
            System.out.println("Printing item: " + i + " which has value: " + a);
            i++;
        }
    }
}