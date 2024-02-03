public class Ex8NumbersSequence {
public static void main(String[] args){
    fun(10);
    System.out.println();
    fun(9);
} public static void fun(int n){
    if(n==0){System.out.print("");}
    else if(n==1){System.out.print(n);}
    else{System.out.print((n+1)/2);
            fun(n-2);
            System.out.print((n+1)/2);}
}}
