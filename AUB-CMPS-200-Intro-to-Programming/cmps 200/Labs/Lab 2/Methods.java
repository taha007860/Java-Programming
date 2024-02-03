public class Methods
{ public static void myFirstMethod(int y){
    System.out.println("The number passed is: "+y);
}
public static void main (String[] args){
    myFirstMethod(25);//The number passed is: 25
    int x= 7;
    myFirstMethod(x);//The number passed is: 7
    // it is wrong put myFirstMethod(int x) in the main
    secondmeth(8.0,3.0);//8.0, 3.0
}
public static void secondmeth( double h, double y){
    System.out.println(h+", "+y);
}
}
