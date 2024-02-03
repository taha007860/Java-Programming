import java.util.*;
import java.util.stream.DoubleStream;

public class Ex4MonteCarloPIEstimation {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        int n=console.nextInt();
        int count=0;
        double area=0;
        double estimate=0;
        for(int i=1;i<=n;i++){
            double x=Math.random();
            double y=Math.random();
            if((Math.pow(x,2)+Math.pow(y,2))<=1){count++;}
        }
        area=(count*1.0)/n;
        estimate=area/1;
        double PI=estimate*4;
        System.out.println(PI);
        //how good?
        System.out.println("Magnitude of the difference within range less than or equal "+Math.abs(Math.PI-PI));
    }
}
