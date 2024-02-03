import java.util.*;
public class Ex2RepeatedStrings {
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int k=scan.nextInt();
int n=scan.nextInt();
ArrayList<String> a= new ArrayList<String>(n);
for(int i=0;i<n;i++){
    String s=scan.next();
    a.add(s);
}
System.out.println(a);
repeat(a,k);
System.out.println(a);
    } public static void repeat(ArrayList<String> b, int k){
        if(k<=0){b.clear();}
        else{
        for(int i=0;i<b.size();i=k){
            for(int j=0;j<k-1;j++){
               b.add(i,b.get(i));
            }
            if(i==k) break;
        }
        }
    }}

