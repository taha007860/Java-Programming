public class SwapNoThirdVar {
    public static void main(String[] args) {
    int a = 15;
    int b = 8;
    System.out.println("Not Swapped");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    int[] arr = swap(a,b);
    System.out.println("Swapped");
    System.out.println("a = " + arr[0]);
    System.out.println("b = " + arr[1]);
    }
    public static int[] swap(int a, int b) {
        b = a + b;
        a = b - a;
        b = b - a;
        int[] arr = {a,b};
        return arr;
    }
}
