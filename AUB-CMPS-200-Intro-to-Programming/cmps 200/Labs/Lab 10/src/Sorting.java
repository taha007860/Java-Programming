import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(bubbleSort()));
    }
    public static int[] bubbleSort() {
        Random r= new Random();
        int[] arr=new int[10];
        for(int k=0;k<10;k++)
            arr[k]= r.nextInt(1001);
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1]< arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
}