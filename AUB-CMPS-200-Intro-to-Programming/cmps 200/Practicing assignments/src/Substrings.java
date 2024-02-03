import java.util.Scanner;
public class Substrings {
    public static void main(String[] args){
       Scanner console=new Scanner(System.in);
       String s3=console.next();
       String s4=console.next();
       System.out.print(howMany(s3,s4));
    } public static int howMany(String s1,String s2){
        int l=s1.length();
        int count=0;
        for(int i=0;i<=s2.length()-1;i++){
            if(s2.substring(i,l).equals(s1)){count++;}
             l=l+1;
            if(l>=s2.length()){break;} }
        return count;
        }
    }

