import java.util.*;
public class Ex5ArraySortingPart1 {
    public static void main(String[] args){
    int[] h={5, 12, -3, 1, 0, - 11, 29, 8};
    System.out.println(Arrays.toString(getMinMax(h,2,5)));
    } public static int[] getMinMax(int[] a,int index1,int index2){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=index1;i<=index2;i++){
            if(a[i]>max){max=a[i];}
            if(a[i]<min){min=a[i];}
        }
        int[] b=new int[2];
        b[0]=min;
        b[1]=max;
        return b;
    }
}
