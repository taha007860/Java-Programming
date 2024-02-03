import java.util.*;
public class banish{
    public static void main(String[] args){
        int[] m= {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
        int[] n= {42, 2222, 9};
        System.out.println(Arrays.toString(banish(m,n)));
        int[] a={2, 999, 999, 4, 6, 999, 1, 999, 8, 999};
        int[] b={999};
        System.out.println(Arrays.toString(banish(a,b)));}//{2, 4, 6, 1, 8, 0, 0, 0, 0, 0}
 public static int[] banish(int[] a1,int[] a2){
    int[] a=new int[a1.length];
    int c=0;
    int y=0;
    for(int i=0;i<a1.length;i++){
        for(int j=0;j<a2.length;j++){
            if(a1[i]==a2[j]){c++;}}
        if(c==1){c=0;continue;}
        a[y]=a1[i];y++;}
    for(int k=y;k<a.length;k++){
        a[y]=0;}
    return a;}}

