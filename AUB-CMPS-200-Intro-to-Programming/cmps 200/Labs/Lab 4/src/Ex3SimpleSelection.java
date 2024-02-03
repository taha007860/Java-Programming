import java.util.Scanner;
public class Ex3SimpleSelection {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=console.nextInt();
        if(age>18){System.out.print("Access granted");}
        else if(age>0){System.out.print("Access denied");}
        else{System.out.print("invalid age value");}
    }

}
