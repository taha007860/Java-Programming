import java.util.*;
public class Ex3Reference {
    public static void main(String[] args){
                int x = 0;
                int[] a = new int[4];
                x++;
                mystery(x, a);
                //2 [0, 0, 1, 0]
                System.out.println(x + " " + Arrays.toString(a));
                //1 [0, 0, 1, 0]
                x++;
                mystery(x, a);
                //3 [0, 0, 1, 1]
                System.out.println(x + " " + Arrays.toString(a));}
                //2 [0, 0, 1, 1]
            public static void mystery(int x, int[] a) {
                x++;
                a[x]++;
                System.out.println(x + " " + Arrays.toString(a));}}


