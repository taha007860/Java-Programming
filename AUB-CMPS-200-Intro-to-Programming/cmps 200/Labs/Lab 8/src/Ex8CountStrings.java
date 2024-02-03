public class Ex8CountStrings {
    public static void main(String[] args){
        String [] f={"hi","hi","hello","hello","hi"};
        String [] l={"hi"};
        System.out.println(countStrings(l,"hi"));
        System.out.println(countStrings(f,"hello"));
    } public static int countStrings(String[] a,String b){
        int c=0;
        for(int i=0;i<a.length;i++){
            if (a[i].equals(b)){c++;}
        }
        return c;}}
