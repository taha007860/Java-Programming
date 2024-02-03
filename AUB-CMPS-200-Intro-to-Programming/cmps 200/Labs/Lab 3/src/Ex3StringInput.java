import java.util.Scanner;
public class Ex3StringInput {
    public static void main(String[] args){
       Scanner console= new Scanner(System.in);
       System.out.print("Enter your name: ");
       String a=console.nextLine();
       String first=a.substring(0,a.indexOf(" "));
       String middleInitial=a.substring(a.indexOf(" ")+1,a.indexOf(" ")+2);
       String last=a.substring(a.indexOf(" ", a.indexOf(" ")+1));
       System.out.print("Welcome to our application "+last+", "+first+" "+middleInitial+".");
    }
}
