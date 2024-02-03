import java.util.Arrays;
public class Ex6RecursivePalindrome {
    public static void main(String[] args){
String[] b={"a","b","c","d","e","e","d","c","b","a"};
String[] a={"a","b","c"};
System.out.println(reversePal(b));
System.out.println(reversePal(a));
System.out.println(reversingPal("abdcba",45));
    } public static boolean reversePal(String[] str){
        if(str.length==0||str.length==1){return true;}
        else if(str[0].equals(str[str.length-1])){
            return reversePal(Arrays.copyOfRange(str, 1,str.length-1));
        }
        else{return false;}
    } public static boolean reversingPal(String a, int b){
        b=a.length()/2;
        if(a.length()==0||a.length()==1){return true;}
        else{if(a.charAt(0)==a.charAt(a.length()-1)){return reversingPal(a.substring(1,a.length()-1),b);}
            else{return false;}}

    }
}
