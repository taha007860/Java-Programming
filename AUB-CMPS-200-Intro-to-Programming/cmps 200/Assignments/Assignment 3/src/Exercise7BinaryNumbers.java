
public class Exercise7BinaryNumbers {
    public static void main(String[] args){
        long h=1001011101;
        long o=11011;
        long f=1001011;
        System.out.println("("+f+") in binary = ("+ConversionBtoD(f)+") in decimal.");
        System.out.println("("+o+") in binary = ("+ConversionBtoD(o)+") in decimal.");
        System.out.println("("+h+") in binary = ("+ConversionBtoD(h)+") in decimal.");
    }
    public static int ConversionBtoD(long n){
        String g=n+"";
        String h="";
        int s=0;
        char v;
        int m=0;
        for(int i=g.length()-1;i>=0;i--){
            v=g.charAt(i);
            String l=v+"";
            int y=Integer.parseInt(l);
            s=(int)(s+y*(Math.pow(2,m)));
            m++;}
            return s;}}

