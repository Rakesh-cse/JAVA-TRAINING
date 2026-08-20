public class Main {
    public static void main(String[] args) {
        String a = "Raakeew";
        for (int i = 0; i < a.length(); i++) {
            int c = 0;
            for (int j = 0; j < a.length(); j++) {
                if (i != j && a.charAt(i) == a.charAt(j)) {
                    c++;
                }
            }
            if (c == 0) { 
                System.out.println(a.charAt(i));
                return;
            }
        }
    }
}