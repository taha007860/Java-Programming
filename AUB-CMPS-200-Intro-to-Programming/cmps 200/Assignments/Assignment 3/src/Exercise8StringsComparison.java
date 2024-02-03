import java.util.Scanner;
public class Exercise8StringsComparison {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s=console.next();
        int add=0;
        int p=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            add=add+c;
        }
        System.out.print("Enter the second string: ");
        String r=console.next();
        for(int j=0;j<r.length();j++){
            char f=r.charAt(j);
            p=p+f;
        }
        if(add==p){System.out.print("\""+s+"\" and \""+r+"\" are equal");}
            else if(add>p){System.out.print("\""+s+"\" is greater than \""+r+"\"");}
                else {System.out.print("\""+s+"\" is less than \""+r+"\"");}

    }
}
