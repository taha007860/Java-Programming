import java.util.Scanner;
public class Ex6FermatPrimes {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        int count=0;
        int s=0;
        int j;
        int h;
        int p=1;
        int n=console.nextInt();
        int x=console.nextInt();
        for(int i=n;i<=x;i++){
            for(j=1;j<=i;j++){
                if(i%j==0){count++;}}
                if(count==2){for(h=1;h<=i;h++){
                  s=4*h+1;
                  if(s==i){System.out.print(i+" ");
                           }}}
                count=0;
                         }
                }

            }

