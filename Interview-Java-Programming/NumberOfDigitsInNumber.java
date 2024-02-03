public class NumberOfDigitsInNumber {
    public static void main(String [] args) {
     System.out.println(numberOfDigits(1, 123411));
     System.out.println(numberOfDigits(5, 0));
     System.out.println(numberOfDigits(0, 0));
     System.out.println(numberOfDigits(1, 523478));
     System.out.println(numberOfDigits(1, -123411));
    }
    public static int numberOfDigits(int digit, int number) {
        if(number < 0) {return numberOfDigits(digit, -number);}
        else if(digit == 0 && number == 0) {return 1;}
        else if(digit!=0 && number == 0) {return 0;}
        else {
        int c=0;
        while(number!=0) {
           int a = number%10;
           if(a == digit){c++;}
           number = number / 10;
        }
        return c; }
    }
}
