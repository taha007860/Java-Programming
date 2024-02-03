import java.util.*;
public class Ex7DicesSum {
    public static void main(String[] args){
        Scanner console=new Scanner (System.in);
        System.out.print("Enter desired dice sum: ");
        int sum=console.nextInt();
        Random one=new Random();
        int r=1+one.nextInt(6);
        int ra=1+one.nextInt(6);
           System.out.println(r+" and "+ra+" = "+(r+ra));
         while((r+ra)!=sum){r=1+one.nextInt(6);
             ra=1+one.nextInt(6);
             System.out.println(r+" and "+ra+" = "+(r+ra));}

    }}

