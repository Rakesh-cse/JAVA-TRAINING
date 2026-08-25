import java.util.*;

public class Main {
    public static int pr(int a, int b) {
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        int s = big;
        while (true) {
            if (big % small == 0) {
                break;
            }
            big = big + s;
        }
        return big;
    }

    public static void main(String[] args) {
        int[] a = {12, 2, 34, 32, 16, 18};
        int lcm = a[0];
        
        for (int i = 1; i < a.length; i++) {
            lcm = pr(lcm, a[i]);
        }
        
        System.out.println("Lcm of the numbers is " + lcm);
    }
}