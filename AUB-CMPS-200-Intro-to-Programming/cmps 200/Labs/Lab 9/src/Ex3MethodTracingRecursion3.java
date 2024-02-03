public class Ex3MethodTracingRecursion3 {
    public static void main(String[] args){
        System.out.println(mystery3(576));
        System.out.println(mystery3(-793));
    } public static int mystery3(int n){
        if(n < 0)
            return -mystery3(-n);
        else if(n < 10)
            return (n + 1) % 10;
        else
            return 100 * mystery3(n / 10) + (n + 1) % 10; }}
//60807
//-80004
