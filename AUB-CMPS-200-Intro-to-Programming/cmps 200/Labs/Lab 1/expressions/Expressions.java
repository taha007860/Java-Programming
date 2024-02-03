package lab1.expressions;

public class Expressions{
    public static void main(String[] args){
        System.out.println(49/5); //prints:9
        System.out.println(49.0/5);//prints:9.8
        System.out.println(49.0%5);//prints:4.0
        System.out.println(5.2+31/10);//prints:8.2
        System.out.println(10+100/10*5-20.5/5);//prints:55.9
        System.out.println("CMPS"+200+12+"L");//prints:CMPS20012L
        System.out.println("CMPS"+(200+12)+"L");//prints:CMPS212L
        System.out.println(200+1+"CMPS");//prints:201CMPS
    }
}