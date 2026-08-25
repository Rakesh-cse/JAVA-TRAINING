public class Main {
    public static int sod(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    public static boolean prime(int i) {
        if (i <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (prime(i) && prime(sod(i))) {
                System.out.print(i+" ");
            }
        }
    }
}