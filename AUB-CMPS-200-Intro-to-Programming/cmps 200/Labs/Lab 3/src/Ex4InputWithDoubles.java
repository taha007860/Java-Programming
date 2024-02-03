import java.util.Scanner;
public class Ex4InputWithDoubles {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        double n=in.nextDouble();
        //Entering 12 by user will result in output:12.0
        //Entering 5.6 by user will result in output:5.6
        //Entering Two by user will result in error
        //Entering 10 * 4 by user will result in output:10.0
        //Entering 10 *4 by user will result in output:10.0
        //Entering 10*4 by user will result in error
        System.out.print(n);
    }
}
