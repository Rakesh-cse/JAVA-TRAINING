public class Main {
    public static void main(String[] args) {
        
        for (int i = 250; i <= 750; i++) {
            int temp = i;
            int count = 0;

            while (temp!=0) {
                int digit = temp % 10;
                
                if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                    count++;
                }
                
                temp = temp / 10;
            }

            if (count == 2) {
                System.out.println(i);
            }
        }
        
    }
}