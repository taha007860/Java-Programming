import java.util.*;
public class Ex4RemoveDuplicates {
    public static void main(String[] args){
       int[] f={0, 0, 0, 1, 1, 3, 4, 4, 4, 4, 6, 6};
      System.out.println(Arrays.toString(removeDuplicates(f)));
    } public static int[] removeDuplicates(int[] a){
        int c=1;
        for(int i=0;i<a.length-1;i++) {
            if (a[i] != a[i + 1]) {
                c++;
            }
        }
        int[] b=new int[c];
        int i;
        int j=0;
        b[j]=a[0];
        for(i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){j++;
                b[j]=a[i+1];}}
    return b;}}
// note: the array entered should be sorted.




