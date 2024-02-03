import java.util.Scanner;
public class Ex5ContainsVowel {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        String s=console.next();
        System.out.println(containsVowel(s));}
    public static boolean containsVowel(String f){
        boolean b= false;
        for(int i=0;i<=f.length()-1;i++){
            char c=f.charAt(i);
            if(c=='a'||c=='u'||c=='e'||c=='i'||c=='o'
            ||c=='A'||c=='U'||c=='E'||c=='I'||c=='O'){
                b=true;
            }}
        return b;
        }
    }

