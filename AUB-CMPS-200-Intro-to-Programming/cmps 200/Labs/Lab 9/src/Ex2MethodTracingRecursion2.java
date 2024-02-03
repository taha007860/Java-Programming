public class Ex2MethodTracingRecursion2 {
    public static void main(String[] args){
        mystery2(25);
        System.out.println();
        mystery2(38);
    } public static void mystery2(int n){
        if(n <= 1)
            System.out.print(": ");
else {
            System.out.print((n%2) + " ");
            mystery2(n / 2);
            System.out.print(n + " ");} }}
//1 0 0 1 : 3 6 12 25 0 1 1 0 0 : 2 4 9 19 38
