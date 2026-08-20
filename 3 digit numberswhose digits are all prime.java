public class Main {
    public static void main(String[] args) {
        System.out.println("3-digit numbers whose digits are all prime numbers:");
        
       
        for (int i = 100; i <= 999; i++) {
            if (hasAllPrimeDigits(i)) {
                System.out.println(i);
            }
        }
    }
    
    
    public static boolean hasAllPrimeDigits(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}