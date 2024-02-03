// Taylor's Series: 1+x+(x^2/2)+(x^3/3!)...+(x^n/n!)
import java.util.Scanner;
public class TaylorSeries {
    public static void main(String[] args){
      Scanner console=new Scanner(System.in);
      int a,b;
      a=console.nextInt();
      b=console.nextInt();
      System.out.println(taylor(a,b));
    }
    public static double taylor(int x,int n){
        double l=0;
        double s=0;
        for(int j=0;j<=n;j++){
            l=Math.pow(x,j)*1.0/factorial(j);
            s=s+l;}
            return s;
        }

     public static int factorial(int p){
        int f=1;
        for(int i=1;i<=p;i++){
            f=f*i;}
        return f;
        }
    }

