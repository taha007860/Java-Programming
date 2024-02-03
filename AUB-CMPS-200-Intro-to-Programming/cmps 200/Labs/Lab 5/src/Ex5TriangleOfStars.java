import java.util.Scanner;
public class Ex5TriangleOfStars {
    public static void main(String[] args){
        Scanner console=new Scanner (System.in);
        int n=console.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
