public class Fibonacci {
    public static void main (String[] args) {
     printFibo(7);
     printFibo(2);
     printFibo(4);
     printFibo(10);
    }
    public static int fibonacci(int a) {
        if (a <= 1) {return a;}
        else {
            a = fibonacci(a - 1) + fibonacci(a - 2);
            return a;
        }
    }
    public static void printFibo(int a) {
        StringBuilder str = new StringBuilder();
       for(int i=0; i<a; i++) {
        str.append(fibonacci(i) + ", ");
       }
       str.replace(str.length() - 2, str.length() - 1, "");
       System.out.println(str);
    }
}
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34