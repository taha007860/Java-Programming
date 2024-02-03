import java.util.Scanner;
public class Ex4RemoveRepetition {
    public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      String a=scan.next();
      System.out.println(dedup(a));
    } public static String dedup(String a){
if(a.length()==1){return""+a.charAt(0);}
else{if(a.charAt(0)!=a.charAt(1)){
return a.charAt(0)+dedup(a.substring(1));}
else return dedup(a.substring(1));}}
}
