import java.util.Scanner;

class Tot {
    int m1, m2, m3, total;
    double percentage;
    String name;

    Tot(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.total = m1 + m2 + m3;
        this.percentage = (this.total / 300.0) * 100;
    }

    void display() {
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the num of student: ");
        int n = scan.nextInt();
        scan.nextLine();

        Tot[] t = new Tot[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the student detail " + (i + 1) + ":");
            
            System.out.print("Enter the student name: ");
            String name = scan.nextLine();

            System.out.print("Enter mark 1: ");
            int m1 = scan.nextInt();

            System.out.print("Enter mark 2: ");
            int m2 = scan.nextInt();

            System.out.print("Enter mark 3: ");
            int m3 = scan.nextInt();
            scan.nextLine();

            t[i] = new Tot(name, m1, m2, m3);
        }

        System.out.println("\n--- Student Percentage ---");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        scan.close();
    }
}