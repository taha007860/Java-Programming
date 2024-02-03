import java.util.Scanner;
public class Ex7ParkingHours {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter the total minutes spent: ");
        int minutes=console.nextInt();
        int hours= minutes/60;
        System.out.println("Hours spent: "+hours);
        int extraMin=minutes-(hours*60);
        System.out.println("Extra minutes: "+extraMin);
        int fee= hours*2;
        System.out.println("Parking fee: $"+fee);
    }
}
