/* acebrf  Output: at index 3: brf
abcbr&f efgklj? Output: at index 1: bcb
                        at index 2: cbr
                        at index 9: fgk
                        at index 10: gkl
                        at index 11: klj


 */
import java.util.Scanner;
public class ConsonantLetters {
    public static void main(String[] args){
        String w="";
        int count=0;
        int t=0;
        Scanner console= new Scanner(System.in);
String f=console.nextLine();
for(int i=0;i<=f.length()-1;i++){
    char v=f.charAt(i);
    if(isLetter(v)&&!isVowel(v)){count++;}
    if(count==3){t=i-2; w=f.substring(i-2,i+1);i=i-2;
        System.out.println("at index "+t+": "+w);
            w="";count=0;}
if(isVowel(v)||!isLetter(v)){count=0;}}}
    public static boolean isLetter(char c){
        if(Character.isAlphabetic(c)){return true;}
        else {return false;}}
        public static boolean isVowel(char q){
                 if(isLetter(q)){if(q=='a'||q=='u'||q=='i'||q=='o'||q=='e'){return true;}
                            else{return false;}}
else{return false;}}}





