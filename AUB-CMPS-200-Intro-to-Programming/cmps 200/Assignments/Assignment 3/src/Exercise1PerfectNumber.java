import java.util.Scanner;
public class Exercise1PerfectNumber {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
       int k=console.nextInt();
      if(perfect(k)==true){System.out.println(k+" is a perfect number!");}
          else{System.out.println(k+" is not a perfect number.");}}
    public static boolean perfect(int n){
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0){s=s+i;}}
        if(s==n){return true;}
        else{return false;}
    }}

