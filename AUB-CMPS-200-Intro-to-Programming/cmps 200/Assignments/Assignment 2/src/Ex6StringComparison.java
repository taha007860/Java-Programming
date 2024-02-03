import java.util.Scanner;
public class Ex6StringComparison {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String firstWord = console.next();
        String secondWord = console.next();
        String thirdWord = console.next();
        int a=firstWord.compareTo(secondWord);
        int b=secondWord.compareTo(thirdWord);
            if(result(firstWord, secondWord, thirdWord)==false){
            System.out.println("They are not ordered.");}
        else {System.out.println("They are ordered alphabetically");}}
        public static boolean result(String fWord,String sWord, String tWord){
        int c = fWord.compareTo(sWord);
        int d = sWord.compareTo(tWord);
        if(c>0&&d>0||c<0&&d<0){return true;}
        else{return false;}}}









