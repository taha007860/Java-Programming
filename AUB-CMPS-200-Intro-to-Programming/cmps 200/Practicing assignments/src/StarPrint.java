import java.util.Scanner;
public class StarPrint {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int x=scan.nextInt();
      System.out.print(square(x));
    } public static String square(int x){
    if(x==0){return "*";}
    else{return square(x-1)+square(x-1);}

    }
}

