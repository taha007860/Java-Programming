public class Errors {
    public static void main(String[] args){
        //int x;
        //System.out.println(x);// There is no value for x
        // corrected:
        int x=2;
        System.out.println(x);
        x=10;
        //int x=20;// x should not be declared again in same method
        // corrected:
        x=20;
        //System.out.println("x is now +x");// corrected:
        System.out.println("x is now "+x);
        //int y=20.5;//y was declared as int but it's double
        //corrected:
        double y=20.5;
    }
}
