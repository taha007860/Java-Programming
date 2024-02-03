public class Ex9AllLess {
    public static void main(String[] args){
        int [] w={0,5,2,};
        int [] r={4,1,6};
        System.out.println(allLess(r,w));//false

    } public static boolean allLess(int[] a,int[] b){
        boolean c=true;
        if(a.length!=b.length){return false;}
        else{for(int i=0;i<a.length;i++){
            if(a[i]>=b[i]){c=false;}
        }}
        return c;
    }
}
