import java.util.Scanner;
public class Ex3NormalHeartRate {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your heart beat rate: ");
        int heartBeatRate=console.nextInt();
        System.out.print("Are you exercising? (yes/no): ");
        String s=console.next();
        if(heartBeatRate>60&&heartBeatRate<100&&s.equals("no")){
            System.out.println("Normal heart beat rate.");}
        else if(heartBeatRate>100&&s.equals("no")){
            System.out.println("Abnormal heart beat rate.");}
        else if(heartBeatRate>100&&s.equals("yes")){
            System.out.println("Normal heart beat rate.");}
        else{System.out.println("invalid input");}



    }}

