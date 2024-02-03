import java.util.*;
public class Ex7AverageGrades {
    public static void main(String[] args){
        int l=0;
        Scanner console=new Scanner(System.in);
        System.out.print("How many grades do you have by now? ");
        int n=console.nextInt();
        int [] s=new int[n];
        for(int i=1;i<=n;i++){
            System.out.print("Enter grade "+i+": ");
            int j=console.nextInt();
            s[i-1]=j;
            l=l+j;
        }
        System.out.println("Your grades: "+Arrays.toString(s));
        System.out.println("Average: "+(l*1.0)/n);
    }
}
