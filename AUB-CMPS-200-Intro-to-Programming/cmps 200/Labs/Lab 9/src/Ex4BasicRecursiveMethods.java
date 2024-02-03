public class Ex4BasicRecursiveMethods {
    public static void main(String[] args){
    writeNums(5);
    System.out.println();
    writeNums(12);
    System.out.println();
    System.out.println(recursiveMultiplication(5,5));
    System.out.println(recursivePower(3,3));
    } public static void writeNums(int n){
        if (n == 1)
            System.out.print("1");
        else {
            writeNums(n - 1);
            System.out.print(", " + n);
    }}
    public static int recursiveMultiplication(int a,int b){
        if(a==0||b==0){return 0;}
         else{a=a+recursiveMultiplication(a,b-1);return a;}}
    public static int recursivePower(int a,int b){
        if(a==0||b==0){return 1;}
          else{a=a*recursivePower(a,b-1);
        return a;}
    }
}
