import java.util.*;
public class Ex1FillArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(fillArray(5,10,100)));
        System.out.println(Arrays.deepToString(fillTwoDArray(4,5,100,10)));
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
}}
