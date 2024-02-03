import java.util.*;
public class Ex1MaxLength {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<String> a=new ArrayList<String>(n);
        for(int i=0;i<n;i++){
            String s=scan.next();
            a.add(s);
        }
System.out.println(maxLength(a));
    } public static int maxLength(ArrayList<String> a){
        if(a.size()==0){return 0;}
        else{
        int maxSize=Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++){
            if(a.get(i).length()>maxSize){maxSize=a.get(i).length();}
        }
        return maxSize;}
    }
}
