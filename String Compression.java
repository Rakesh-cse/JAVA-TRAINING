public class Main {
    public static void main(String[] args) {
        String x = "aabbaaacccbbdd";
        String y = "";
        int c = 1;

        for (int i = 0; i < x.length(); i++) {
            if (i + 1 < x.length() && x.charAt(i) == x.charAt(i + 1)) {
                c++;
            } else {
                y = y + x.charAt(i);
                y = y + (Integer.toString(c));
                c = 1;
            }
        }

        System.out.println(y);
    }
}