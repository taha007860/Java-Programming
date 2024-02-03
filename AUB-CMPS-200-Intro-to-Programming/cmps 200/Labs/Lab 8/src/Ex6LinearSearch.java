public class Ex6LinearSearch {
    public static void main(String[] args){
        int [] w={45,67,2,-10,54};
        System.out.println(linearSearch(w,67));

    } public static int linearSearch(int[] a,int b){
        int c=0;
        int n=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                c++;
                n=i;
            }
        }
        if(c>1){return c;}
        else{return n;}
    }}
