import java.util.Scanner;
public class writeSquaresRecursion {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       writeSquares(n);
    } public static void writeSquares(int n){
        if(n==1){System.out.print("1");}
            else{if(n%2==0){writeSquares(n-1);System.out.print(", "+(n*n));}
                else{System.out.print((n*n)+", ");writeSquares(n-1);}}
    }
}
