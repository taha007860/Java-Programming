import java.util.*;
public class Ex6DiceGame {
    public static void main(String[] args){
      System.out.println(Arrays.deepToString(sum()));
    } public static int[][] sum(){
        int s=0;
        int [][] j=new int[2][11];
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.print("Specify how many times to roll: ");
        int f=scan.nextInt();
        for(int k=1;k<=f;k++){
            int a=rand.nextInt(6)+1;
            int b=rand.nextInt(6)+1;
            s=a+b;
        for(int i=0;i<=10;i++){
           if(i<=10){j[0][i]=i+2;}
            if (i<=10&&s==i+2)
            j[1][i]++;
        }}/* note: first row of the array (row 0) corresponds to the sum and second row (row 1)
         corresponds to the number of occurrences of the sum. */
return j;
    }
}
