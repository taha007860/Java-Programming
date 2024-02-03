public class Ex6FactorsOf2 {
    public static void main(String[] args){
        showFactors2(7);
        showFactors2(18);
        showFactors2(68);
        showFactors2(120);
    }
    public static void showFactors2(int n){
        int y=n;
        String s=y+"=";
        System.out.print(s);
        while(n%2==0){n=n/2;
            System.out.print("2*");
            }
        s=""+n;
        System.out.print(s);
        System.out.println();
    }
}
