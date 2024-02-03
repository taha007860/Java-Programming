import java.util.*;
public class Ex5ArraySortingPart2 {
    public static void main(String[] args){
        int[] u=fillArray(10,1,100);
        int[][] z=fillTwoDArray(4,5,100,10);
        System.out.println(Arrays.deepToString(z));
        for(int i=0;i<=3;i++){
            z[i]=sorted(z[i],0,4);
        }
        System.out.println(Arrays.deepToString(z));
        System.out.println(Arrays.toString(u));
        System.out.println(Arrays.toString(sorted(u,0,9)));
    } public static int[] fillArray(int s,int min,int max){
        int[] a=new int[s];
        for(int i=0;i<s;i++){
            a[i]=(int)((Math.random()*(max-min))+min);
        }
        return a;
    } public static int[][] fillTwoDArray(int row,int column,int max,int min){
        int [][] a=new int[row][column];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=(int)((Math.random()*(max-min))+min);
            }
        }
        return a;
    }
    public static int[] getMinMax(int[] a,int index1,int index2) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexOfMax = 0;
        int indexOfMin = 0;
        int i;
        for (i = index1; i <= index2; i++) {
            if (a[i] > max) {
                max = a[i];
                indexOfMax = i;
            }
            if (a[i] < min) {
                min = a[i];
                indexOfMin = i;
            }
        }
        int[] b = new int[4];
        b[0] = min;
        b[1] = max;
        b[2] = indexOfMin;
        b[3] = indexOfMax;
        return b;
    }
    public static int[] sorted(int[] n,int h,int l){
        int temp1=0;
        int temp2=0;
        int[] z;
        int minIndex=0;
        int maxIndex=0;
        while(h<=l){z=getMinMax(n,h,l);
           temp1=n[h];
       n[h]=z[0];
        minIndex=z[2];
           n[minIndex]=temp1;
           z=getMinMax(n,h,l);
           temp2=n[l];
           n[l]=z[1];
          maxIndex=z[3];
          n[maxIndex]=temp2;
      h++;
      l--;}
      return n;
}}
