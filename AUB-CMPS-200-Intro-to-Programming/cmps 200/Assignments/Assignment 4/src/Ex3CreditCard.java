import java.util.Scanner;
public class Ex3CreditCard {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        double bill=console.nextDouble();
        System.out.print("The bill is: $"+bill);
        double pay=console.nextDouble();
        System.out.print("The monthly payment is: $"+pay);
        double interest=console.nextDouble();
        System.out.println("The interest rate is: "+interest+"%");
        double balance=bill;
        pay=0;
        int count=0;
        int month=0;

        while(balance>0){pay=pay+100;balance=(balance*interest/100)+balance-100;
            count++;
        System.out.print("Month : "+count);
                System.out.printf(" Balance: $ %.13f",balance);
                System.out.print(" total payments "+pay);
        System.out.println();}
    }
}
