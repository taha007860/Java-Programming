public class Minimum {
    public static int getMin(int a, int b, int c){
        int d= Math.min(Math.min(a, b), c);
        return d;
    }
    public static double getMin(double x, double y, double z){
        double w= Math.min(Math.min(x, y), z);
        return w;
    }
    public static void main(String[] args){
        int s= getMin(11,6,3);
        double t= getMin(8.3, 5, 7.8);
        System.out.println(s);
        System.out.println(t);
    }
}
