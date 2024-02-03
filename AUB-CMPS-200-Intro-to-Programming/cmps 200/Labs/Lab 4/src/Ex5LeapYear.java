import java.util.Scanner;
public class Ex5LeapYear {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=console.nextInt();
        if(year<0){System.out.print("invalid year input");}
        else if((year%4==0&&year%100!=0)||year%400 == 0){System.out.print("Leap year");}
            else{System.out.print("Not a leap year");}
    }
}
