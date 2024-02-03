public class CheckVowel {
    public static void main (String[] args) {
    String str1 = "Hello";
    String str2 = "jkl";
    System.out.println(checkVowelPresence(str1));
    System.out.println(checkVowelPresence(str2));
    }
    public static boolean checkVowelPresence(String str) {
        char c;
        for(int i=0; i<str.length(); i++) {
        c=str.charAt(i);
        if(c=='a' || c=='e' || c=='u' || c=='o' || c=='i' || c=='A' || c=='E' || c=='U' || c=='O' || c=='I') {
            return true;
        }
        }
        return false;
    }
    
}
