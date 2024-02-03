import java.util.Scanner;
public class writeCharsRecursion {
    public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     writeChars(n);
    } public static void writeChars(int n){
        if(n==1){System.out.print("*");}
        else if(n==2){System.out.print("*");writeChars(n-1);}
        else{System.out.print("<");writeChars(n-2);System.out.print(">");}
    }
}
