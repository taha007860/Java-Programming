import java.util.*;
public class Test {
    public static void main(String[] args){
        ArrayList<Card> a= new ArrayList<Card>();
        System.out.println(a.size());
        Card c1=new Card("A","Spades");
        Card c2=new Card("A","Spades");
        a.add(c1);
        a.add(c2);
        for(Card s:a){
            System.out.println(s);
        }
        System.out.println(a.contains(c1));
        System.out.println(a.contains(new Card("A","Spades")));
        System.out.println(c1.equals("hi"));}}
       /* String name=new String("Hello");
        String name2=new String("Hello");
        System.out.println(name.equals(name2));
        Card c1=new Card("A","Spades");
        Card c2=new Card("A","Spades");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));}}*/

