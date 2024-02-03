import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        int a=console.nextInt();
        double x=a;
        do{x=(x+a/x)/2.0;}
        while(Math.pow(x,2)-a>(1E-7));// for non-perfect square numbers
        System.out.println(x);
    }
}
