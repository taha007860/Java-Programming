import java.util.Scanner;
public class Ex2GCD {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        System.out.println(gcd(n,m));}
    public static int gcd(int p, int q){
        if(p>q){if(q==0){return p;}
            else{return gcd(p%q,q);}}
       else{if(p==0){return q;}
            else{return gcd(q%p,p);}}
    }
    }

