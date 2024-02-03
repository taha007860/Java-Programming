public class ErrorsWithMethods {
    public static void main (String[] args){
        // corrected version
        int x= 20;
        int y;
        y= doubleNumber(10);// we should put a value
        System.out.println(y);// we can't put System.out.println(result) since result is not declared in main
        double z;// z is not an integer. It is a double.
        z = powerTwo(x);
    }
    public static int doubleNumber(int a){
        int result= a*2;
        return result;
    }
    public static double powerTwo(double a){
        double b=a*a;
        return b;// should return a value
    }
}
