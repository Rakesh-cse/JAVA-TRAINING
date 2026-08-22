public class Main {
    public static void main(String[] args) {
        int a = 54321;
        int l, p;
        boolean f = true;

        while (a!=10) {
            l = a % 10;
            p = (a / 10) % 10;

            if (p < l) {
                f = false;
                break;
            }
            a = a / 10;
        }

        if (f) {
            System.out.println("Descending No");
        } else {
            System.out.println("Non Descending no");
        }
    }
}