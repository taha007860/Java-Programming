/*python grid.py 5 6
        0 5 10 15 20 25
        1 6 11 16 21 26
        2 7 12 17 22 27
        3 8 13 18 23 28
        4 9 14 19 24 29*/
        import java.util.Scanner;
public class Grid {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        int m=console.nextInt();
        int n=console.nextInt();
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                System.out.print(i+m*j+" ");
            }

            System.out.println();
        }
    }}


