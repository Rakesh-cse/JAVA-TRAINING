import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 4}, {5, 6, 7}, {6, 7, 8}, {4, 2, 3}};
        int r = a.length;
        int c = a[0].length;
        int[] b = new int[r * c];
        int x = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[x] = a[i][j];
                x++;
            }
        }

        System.out.print(Arrays.toString(b));
    }
}