import java.util.*;
public class Ex2MathMethods {
    public static void main(String[] args){
        Scanner console= new Scanner(System.in);
        double a= console.nextDouble();
        double negativeValueGrade=-60;//-60 is an example, but we can put any negative value
        Math.max(negativeValueGrade,0);/* statement that takes the maximum which is zero since zero is
        always greater than negative numbers (meaning that we don't want to have negative value grades) */
        double aboveMaxGrade=150;//150 is an example, but we can put numbers that are higher than 100
        Math.min(aboveMaxGrade,100);/* statement that takes the minimum here which is 100
        (meaning that we don't want any grade that is above 100) where aboveMaxGrade is greater than 100 */
    }
}
