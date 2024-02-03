import java.util.*;
public class Ex7MatrixMultiplication {
    public static void main(String[] args){
    int [][] m={{4,5,2},{6,3,8}};
    int [][] n={{1,5},{1,2},{3,2}};
    int [][] x=matrixMultiplication(m,n);
    System.out.println(Arrays.deepToString(x));
    } public static int[][] matrixMultiplication
            (int[][] a,int[][] b){
        int[][] c= new int[a.length][b[0].length];
        int s=0;
        int h=0;
        int g=0;
        int k=0;
        int p=0;
        int v=0;
        int t;
        if(a[0].length==b.length){
            for(int j=0;j<a.length;j++){
                for(t=1;t<=b[0].length;t++){
                for(h=0;h<b.length;h++){
              s=s+a[j][h]*b[h][v];}
                v++;
                for(g=g;g<b[0].length;)
                {c[k][g]=s;break;}
                g++;
                if(g==b[0].length){k++;}
                s=0;}
                v=0;
                g=0;}
            return c;}
        else{return null;}
    }
}
