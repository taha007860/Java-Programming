import java.util.ArrayList;

public class test2{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(6);
        a.add(8);
        ArrayList<Integer> b=a;
        System.out.println(b);
        b.add(3);
        System.out.println(a);

    }
}