import java.util.Scanner;
public class Ex6InteractiveInput {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String a=console.nextLine();
        System.out.print("Enter your id number: ");
        int b=console.nextInt();
        System.out.print("Enter the fulfilled credits: ");
        int c=console.nextInt();
        System.out.print("Enter the number of failed credits: ");
        int d=console.nextInt();
        System.out.println("--------------------");
        System.out.println("Student \""+a+" - "+b+"\":");
        System.out.println("Credits taken: "+c);
        System.out.println("Credits failed: "+d);
        int r=90-c+d;
        System.out.println("Remaining credits: "+r);



    }
}
