public class Ex1ShortAnswers {
    public static void main(String[] args){
        /* 1) System.out.println(++(x+y)) This is wrong since we should put values for x and y
         and because we can't do ++ for an expression
        Correction:*/
        int x=10, y=10;
        int c=x+y;
        System.out.println(++c); //prints: 21
        traceMe(3);}
         /* 2) for(double i = 0.1; i != 1; i+=0.1)
            System.out.print(i +" ");
            This is an infinite loop since i will never be = to 1. Since the update contains adding
            0.1 to i which is also a double. Because of this, it will not reach one instead it will
            reach 1.0000000001 or something like that not 1
            (The computer represents doubles in an imprecise way.)
            3) Here in this exercise, we can specify a value for parameter x in the main in order
             to work on it and see the output in easier way. Let us take x as value of 3.*/
             public static void traceMe(int x)
              {
              for(int i=1; i<=x; i++)
              {
              for(int j=1; j<=i; j++)
              System.out.print("*");
              for(int j=1; j<=2*x - 2 * i;j++)
              System.out.print("-");
              for(int j=1; j<=i; j++)
              System.out.print("*");
              System.out.println();}
              /* Output:
              *----*
              **--**
              ******

              */





}
}






