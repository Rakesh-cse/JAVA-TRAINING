import java.util.Scanner;

class Rect {
    int length, breadth;

    Rect(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Area: " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No of Rectangles:");
        int n = sc.nextInt();

        Rect[] r = new Rect[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the length for rectangle " + (i + 1) + ":");
            int l = sc.nextInt();
            System.out.println("Enter the breadth for rectangle " + (i + 1) + ":");
            int b = sc.nextInt();

            r[i] = new Rect(l, b);
        }

        System.out.println("\n--- Rectangle Details ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Rectangle " + (i + 1) + " -> ");
            r[i].display();
        }

    }
}