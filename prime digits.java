public class Main {
    public static void main(String[] args) {
        int count = 0;
        
        for (int i = 250; i <= 750; i++) {
            String s = String.valueOf(i);
            int primeDigitCount = 0;
            
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == '2' || ch == '3' || ch == '5' || ch == '7') {
                    primeDigitCount++;
                }
            }
            
            if (primeDigitCount == 2) {
                count++;
            }
        }
        
        System.out.println("Total number with exactly two prime digits: " + count);
    }
}