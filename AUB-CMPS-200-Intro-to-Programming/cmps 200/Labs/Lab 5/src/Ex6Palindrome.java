import java.util.Scanner;
public class Ex6Palindrome {
    public static void main(String[] args){
        System.out.println(isChecked());
        System.out.println(isChecking());}
    public static boolean isChecked(){
        Scanner console = new Scanner(System.in);
        String s=console.next();
        s=s.toLowerCase();
            boolean isChecked=true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    isChecked=false;
            }}
            return isChecked;}
//Or
public static boolean isChecking(){
    Scanner console=new Scanner(System.in);
    String d=console.next();
    d=d.toLowerCase();
    String l="";
    String f="";
    for(int index=0;index<d.length();index++){
        char c=d.charAt(index);
        l=l+c;
    }
    for(int index=d.length()-1;index>=0;index--){
        char e=d.charAt(index);
        f=f+e;
    }
    if(f.equals(l)){return true;}
    else{return false;}
    }
}





