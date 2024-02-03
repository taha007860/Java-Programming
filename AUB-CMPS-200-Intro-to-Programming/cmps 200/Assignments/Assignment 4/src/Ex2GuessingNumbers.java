/* VERY IMPORTANT NOTE: Professor, in this exercise, there are a lot of inputs that should be put correctly by the user
to reach the final solution and guess the number
 */


import java.util.Scanner;
public class Ex2GuessingNumbers<b> {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        int x=console.nextInt();
        int temp=x;
        System.out.println("is my number equal to x?");
        boolean b=console.nextBoolean();
        System.out.println("is my number less than x?");
        boolean c=console.nextBoolean();
        System.out.println("is my number (after having x greater than my number if it is smaller) greater than half of x ");
        boolean h=console.nextBoolean();
        System.out.println("is my number equal to half x?");
        boolean s=console.nextBoolean();
        if(b==true){System.out.println(x);}
        else{
        while(b==false){while(c==false){x=x*2;temp=x;c=console.nextBoolean();}
            if(s==true){System.out.println(x/2);break;}
            else {
          while(b==false){if(h==true){x=x/2; c=false; while(c==false){x=x+(temp-x)/2;c=console.nextBoolean();
             if(c==true){while(b==false){x--;b=console.nextBoolean();}}}}
            else{temp=x;while(h==false){temp=temp/2;h=console.nextBoolean();} if(h==true){c=false;x=temp/2;} while(c==false){x=x+(temp-x)/2;c=console.nextBoolean();}
            if(c==true){while(b==false){x--;b=console.nextBoolean();}}}}

        System.out.println(x);}}}}}

