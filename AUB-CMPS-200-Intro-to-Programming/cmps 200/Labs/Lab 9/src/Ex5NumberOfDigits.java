public class Ex5NumberOfDigits {
    public static void main(String[] args){
System.out.println(numberOfDigits(345));
    } public static int numberOfDigits(int a){
        if(a<=0){return 0;}
        else{return 1+numberOfDigits(a/10);}
    }
}
