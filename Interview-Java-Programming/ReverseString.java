public class ReverseString {
    public static void main(String[] args) {
        try {
            StringBuilder strblr1 = reverseString("Hello");
            StringBuilder strblr2 = reverseString("How are you?");
            System.out.println(strblr1);
            System.out.println(strblr2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static StringBuilder reverseString(String str) {
        if(str == null) {
            throw new IllegalArgumentException("Null is not a valid input");
        }
        char c;
        StringBuilder strblr = new StringBuilder();
        for(int i = str.length() - 1; i>=0; i--) {
           c=str.charAt(i);
           strblr.append(c);
        }
        return strblr;
    }
}