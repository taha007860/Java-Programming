public class Exponent {
public static void main(String[] args){
    double x=Double.parseDouble(args[0]);
    double y=Double.parseDouble(args[1]);
    double a=Math.pow(x,y);
    double r=Math.round(a);
    int g= (int) r;
    System.out.print(g);
}
}
