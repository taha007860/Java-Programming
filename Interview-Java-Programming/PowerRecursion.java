public class PowerRecursion {
    public static void main (String[] args) {
    try {
    int n1 = (int) power(0,1 );
    int n2 = (int) power(1,0 );
    int n3 = (int) power(1,1 );
    int n4 = (int) power(2,4 );
    int n5 = (int) power(2,5 );
    int n6 = (int) power(-2,4 );
    double n7 = power(2,-4);
    double n8 = power(-2,-4);
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    System.out.println(n4);
    System.out.println(n5);
    System.out.println(n6);
    System.out.println(n7);
    System.out.println(n8);
    }
    catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
    public static double power(double x, double y) throws Exception {
        if(x == 0 && y == 0) {throw new Exception("Not defined");}
        else if(x<0) {return -power(-x,y);}
        else if(y<0) {return 1/power(x,-y);}
        else if(y == 0) {return 1;}
        else if(y == 1) {return x;}
        else if (x == 0) {return 0;}
        else if (x == 1) {return 1;}
        else if(y%2==0) {
            return power(x, y/2) * power(x, y/2);
        }
        else {
            return x * power(x, (y-1)/2) * power(x, (y-1)/2);
        }
    }
}
