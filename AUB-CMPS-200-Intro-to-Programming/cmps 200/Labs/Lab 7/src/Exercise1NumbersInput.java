import java.util.Scanner;
public class Exercise1NumbersInput {
    public static void main(String[] args){
        double s=0,c=0,avg=0;
        Scanner console=new Scanner(System.in);
        while(console.hasNextDouble()){
            s+= console.nextDouble();
            c++;
        }
        console.next();
        System.out.println("Sum: "+s);
        System.out.println("Average: "+((s*1.0)/c));
    }
}
