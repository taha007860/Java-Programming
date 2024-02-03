import java.util.Scanner;
public class Ex4GPADistinction {
    public static void main(String[] args){
        Scanner console= new Scanner(System.in);
        System.out.print("Enter your GPA: ");
        double gpa=console.nextDouble();
        if(gpa>=4.0||gpa<=0){
            System.out.print("invalid GPA value");}
        else if(gpa>=3.8){System.out.print("High Distinction");}
            else if(gpa>=3.5){System.out.print("Distinction");}
                else if(gpa>=3.2){System.out.print("Honor");}
                    else{System.out.print("None");}
        }
    }

