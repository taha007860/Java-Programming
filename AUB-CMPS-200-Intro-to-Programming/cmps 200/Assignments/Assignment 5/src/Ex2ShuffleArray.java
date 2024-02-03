import java.util.*;
public class Ex2ShuffleArray {
    public static void main(String[] args){
        int[] b={45,23,1,5,98};
        System.out.println(Arrays.toString(shuffle(b)));
    } public static int[] shuffle(int[] a){
        for(int i=0;i<a.length;i++){
            int f=(int)(Math.random()*a.length);
            int temp=0;
            if(i!=f) {temp=a[i];a[i]=a[f]; a[f]=temp;}
            else{while(i==f) f=(int)(Math.random()*a.length);
                temp=a[i];a[i]=a[f];a[f]=temp;}
            }
            return a;
    }
}
