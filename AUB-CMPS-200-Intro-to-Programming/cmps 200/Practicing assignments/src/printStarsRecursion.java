import java.util.Scanner;
public class printStarsRecursion {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
         starString(n);
    } public static void starString(int n){
            if(n==0){System.out.print("*");}
            else if(n==1){System.out.print("*"); starString(n-1);}
            else{starString(n-1);starString(n-1);}}


    }
