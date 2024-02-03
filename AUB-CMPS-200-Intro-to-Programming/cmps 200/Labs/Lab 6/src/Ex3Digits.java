public class Ex3Digits {
    public static void main(String[] args){
        System.out.println(allEvenDigits(20426));
        System.out.println(allEvenDigits(14654));

    }public static boolean allEvenDigits(int a){
        while(a>0){
            int last=a%10;
            if(last%2!=0){return false;}
            a=a/10;}
return true;
        }
    }

