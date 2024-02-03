import java.util.Scanner;
public class Ex6DifferentWays {
    public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int x=scan.nextInt();
     System.out.println(differentWays(n,x));
    } public static int differentWays(int n, int x){
        if(n==x){return 1;}
        else if(x==1){return n;}
        else{return differentWays(n-1,x-1) + differentWays(n-1, x);}
    }
}
