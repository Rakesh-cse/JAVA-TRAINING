import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[][] a = new char[10][9];
        
        for (int i = 0; i < 10; i++) {
            Arrays.fill(a[i], ' ');
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (j == 0 || j == 8) {
                    a[i][j] = '*';
                }
                if (i == j && i < 5) {
                    a[i][j] = '*';
                }
                if (i + j == 8 && i < 4) {
                    a[i][j] = '*';
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}