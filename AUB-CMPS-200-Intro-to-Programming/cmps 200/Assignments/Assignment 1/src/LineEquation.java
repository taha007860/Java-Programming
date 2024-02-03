public class LineEquation {
    public static void slope(double x1, double y1, double x2, double y2){
        double A =(y2-y1)/(x2-x1);
        double B= y1-(A*x1);
        System.out.println("y = "+A+"x + ("+B+")");
    }
    public static void main(String[] args){
        slope(2.0,3.0,1.5,7.0);
    }
}
