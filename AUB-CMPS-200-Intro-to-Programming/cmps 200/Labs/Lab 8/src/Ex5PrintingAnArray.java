import java.util.*;
public class Ex5PrintingAnArray {
    public static void main(String[] args){
        int [] a={10, 4, 10002, 453, 24};
        int [] b={4,-23,89,100,-34,0};
        for(int j=0;j<b.length;j++){
            System.out.printf("Element ["+j+"] =%7d\n",b[j]);
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.printf("Element ["+i+"] =%7d\n",a[i]);
        }
    }

}
