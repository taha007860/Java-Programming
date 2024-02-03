import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
System.out.print(reverse(s));
    } public static String reverse(String s){
        if(s.length()==1){return s;}
        else{return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));}
    }
}
