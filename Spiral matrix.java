import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
            {2, 3, 4, 3, 5},
            {7, 6, 8, 9, 7},
            {5, 6, 7, 6, 8},
            {4, 5, 6, 7, 6},
            {8, 4, 2, 3, 4}
        };

        int top = 0;
        int bottom = a.length-1;
        int left = 0;
        int right = a[0].length-1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}