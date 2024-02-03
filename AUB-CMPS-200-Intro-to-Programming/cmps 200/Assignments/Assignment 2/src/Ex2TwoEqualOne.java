public class Ex2TwoEqualOne {
    public static void main(String[] args){
        int num4=Integer.parseInt(args[0]);
        int num5=Integer.parseInt(args[1]);
        int num6=Integer.parseInt(args[2]);

        boolean b=meth(num4,num5,num6);
        System.out.println(b);

    }
    public static boolean meth(int num1,int num2,int num3){
        if(num1+num2==num3||num1+num3==num2||num2+num3==num1){return true;}
        else{return false;}

    }
}
