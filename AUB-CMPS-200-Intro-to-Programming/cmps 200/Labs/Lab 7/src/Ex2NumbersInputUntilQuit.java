import java.util.Scanner;
public class Ex2NumbersInputUntilQuit {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        String s="quit";
        int sum=0;
        int n;
        String d="";
        System.out.print("Enter sequence of numbers ('quit' to stop):");
        while(true){
            if(d.equals(s)){break;}
           while(console.hasNextInt()){n=console.nextInt();sum+=n;}
           if(!console.hasNextInt()){d=console.next();}}
        System.out.print("Total = "+sum);}}

