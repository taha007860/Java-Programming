public class Ex4MaximumInAnArray {
    public static void main(String[] args){
        int [] b={12, 7, -1, 25, 3, 9};
        int [] v={-4,-12,8,5,-39};
        int [] t={-2,-8,-56,-7};
        System.out.println(getMax(b));
        System.out.println(getMax(v));
        System.out.println(getMax(t));

    } public static int getMax(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
          if(a[i]>max){max=a[i];}
        }
        return max;
    }
}
