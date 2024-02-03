import java.text.DecimalFormat;
import java.util.*;
public class BankAccount {
    private static final DecimalFormat df= new DecimalFormat("0.00");
    private String id;
    private double balance;
    private int transactions;
    private String[] listTransactions=new String[Integer.MAX_VALUE-147483647-200000000*7-20000000*5-2000000*3-200000*8-20000*4-2000*6-200*7-20*8-2*5-1-1];//maximum size that can be put for an array if we don't want to see space errors
    public BankAccount(String id){
        this.id=id;
    } public double getBalance(){
        return balance;
    } public String getId(){
        return id;
    } public int getTransactions(){
      return transactions;
    } public void deposit(double amount){
        if(amount>0&&amount<500){balance=amount+balance;
        transactions++;
        listTransactions[transactions-1]="Deposit of $ "+amount;}
    } public void withdraw(double amount){
        if(balance>=amount){balance=balance-amount;
        transactions++;
        listTransactions[transactions-1]="Withdraw of $ "+amount;}
        else{System.out.println("not enough money to withdraw");}}
    public String toString(){
        return "<"+id+">,$<"+df.format(balance)+">";}
    public boolean transactionFee(double fee) {
        double amount = (fee * transactions * (transactions + 1)) / 2;

        if(balance > amount) {
            balance -= amount;
            return true;
        }

        balance = 0;
        return false;}
public void transfer(BankAccount acc,double amount){
        int c=0;
if(balance-5>=(amount)){balance=balance-(amount+5.00); acc.balance=acc.balance+amount;
    transactions++;
    listTransactions[transactions-1]="transfer from of: "+amount+" and $5.00 fee";
    acc.listTransactions[c]="transfer to of: "+amount;
c++;}
else if(balance-5<amount&&balance-5>0){acc.balance=acc.balance+(balance-5);
    transactions++;
    listTransactions[transactions-1]="transfer from of: "+(balance-5)+" and $5.00 fee";
    balance=0;
    acc.listTransactions[c]="transfer to of: "+(balance-5);c++;}
else {System.out.print("no transfer");}
}
public static void main(String[] args){
        BankAccount a=new BankAccount("Mohamad");
        BankAccount b=new BankAccount("Abdo");
        System.out.println(a);
        Scanner scan=new Scanner(System.in);
        a.balance=scan.nextDouble();
        System.out.println(a.getBalance());
        System.out.println(a.getId());
        System.out.println(a);
        a.transactions=0;
        System.out.println(a.getTransactions());
        a.deposit(350);
        a.deposit(200);
        a.deposit(700);
        a.withdraw(300);
        a.withdraw(200);
        a.withdraw(1000);
        a.transfer(b,470);
    System.out.println(Arrays.toString(Arrays.copyOfRange(a.listTransactions,0,a.transactions)));
        System.out.println(a.balance);
        System.out.println(a.transactions);
       System.out.println(a.transactionFee(20));
       System.out.println(a.balance);
       System.out.println(b.balance);
    System.out.println(Arrays.toString(Arrays.copyOfRange(a.listTransactions,0,a.transactions)));
}}