import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        String b = "";
        Random r = new Random();
        int i = 0, d;
        
        while (i < 5) {
            d = r.nextInt(10) + 1;
            String x = String.valueOf(d);
            
            if (!b.contains(x)) {
                a[i] = d;
                i++;
                b += x;
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
}