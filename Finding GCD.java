import java.util.*;

public class Main {
    public static int pr(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
public static void main(String[] args) {
        int[] a = {12, 2, 34, 32, 16, 18};
        int gcd = a[0];
        
        for (int i = 1; i< 6; i++) {
            gcd=pr(gcd,a[i]);
            
        }
        
        System.out.println("GCD of the numbers is " + gcd);
    }
}