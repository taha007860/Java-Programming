import java.util.Arrays;
import java.util.Random;

public class Ex1RandomWalk {
    public static void main(String[]args){
        manhattan(5,11);
    }
    public static void manhattan(int a,int b){
        int[][] array = new int[a][b];
        Random r=new Random();
        int i=0,j=0;
        while(i>=-a/2&&i<=a/2&&j>=-b/2&&j<=b/2){
            array[a/2+i][b/2+j]++;
            if(r.nextInt(2)==0)
                i+=(int)Math.pow(-1,r.nextInt(2));
            else
                j+=(int)Math.pow(-1,r.nextInt(2));

        }
        for(int k=0;k<array.length;k++)
            System.out.println(Arrays.toString(array[k]));
    }
}
