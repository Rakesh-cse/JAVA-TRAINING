public class Main {
    public static boolean isDescending(int n) {
        
        if (n < 10) {
            return true; 
        }
        
        int lastDigit = n % 10;
        n /= 10;
        
        while (n > 0) {
            int currentDigit = n % 10;
            
            
            if (currentDigit <= lastDigit) {
                return false;
            }
            
            lastDigit = currentDigit;
            n /= 10;
        }
        
        return true;
    }

    public static void main(String[] args) {
        int a = 54321;
        
        System.out.println("Input: " + a);
        if (isDescending(a)) {
            System.out.println("The digits are in descending order.");
        } else {
            System.out.println("The digits are NOT in descending order.");
        }
    }
}