import java.util.Scanner;
public class Exercise4TriangleOfStars {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        int n=console.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=-i+n;j++){
                System.out.print(" ");}
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");}
            for(int j=1;j<=-i+n;j++){
                System.out.print(" ");}
            System.out.println();}
        }
    }

