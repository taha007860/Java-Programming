import java.util.Scanner;
public class Ex3StringRepetition {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       String a=scan.nextLine();
       int n=scan.nextInt();
       System.out.println(repeat(a,n));
    } public static String repeat(String a,int n){
if(n<0)throw new IllegalArgumentException("");
else if(n==0){return "";}
else{return a+repeat(a,n-1);}}
}
