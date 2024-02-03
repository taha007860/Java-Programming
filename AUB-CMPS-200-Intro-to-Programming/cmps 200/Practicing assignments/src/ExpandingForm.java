/*System.out.println(expanded(3467)); Output:3000 + 400 + 60 + 7
System.out.println(expanded(2089)); Output:2000 + 80 + 9 */
import java.util.Scanner;
public class ExpandingForm {
    public static void main(String[] args){
        int b;
Scanner console=new Scanner(System.in);
b=console.nextInt();
System.out.println(expanded(b));
    }
    public static String expanded(int a){
        String s=a+"";
        String g="";
        int p=0;
        int k=1;
        int c=1;
        int h=s.length()-1;
       for(int i=h;i>=0;i--){
         p=a/((int)Math.pow(10,i));
            k=p%10;
          k=k*((int)Math.pow(10,i));
        if(k!=0) {g=g+k+" + ";}}

        g=g.substring(0,g.length()-2)+g.substring(g.length()-1);
        return g;}}




