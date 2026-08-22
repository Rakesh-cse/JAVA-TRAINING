public class Main {
    public static void main(String[] args) {
        String text = "Praveen@123#$";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            
            if (Character.isDigit(ch)) {
                System.out.println("Number: " + ch);
            } 
            
            else if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                System.out.println("Special Char: " + ch);
            }
        }
    }
}