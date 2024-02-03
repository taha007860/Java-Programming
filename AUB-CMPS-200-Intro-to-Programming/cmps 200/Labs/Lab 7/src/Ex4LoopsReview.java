import java.util.Scanner;
public class Ex4LoopsReview {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n=console.nextInt();
        int h=1;
        int largest=0;
        int c=0;
        int d=0;
        boolean b=true;
        for(int i=1;i<=n;i++){
         if(b)System.out.print("Enter number "+i+": ");
          h=console.nextInt();
            if(largest==h){c++;}
              else if(largest<h){largest=h;c=1;}

        if(h<0){b=false;break;}}
        if(b) System.out.print("The largest number is "+largest+". The occurrence count of it is "+c);

        }
    }

