import java.util.Scanner;
public class Ex5MultiplyEven {
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
System.out.println(multiplyEvens(n));
    } public static int multiplyEvens(int n){
if(n<=0){throw new IllegalArgumentException("");}
else if(n==1){return 2;}
else{return multiplyEvens(n-1)*(n*2);}}
}
