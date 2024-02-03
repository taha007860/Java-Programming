import java.util.*;
public class Card implements Comparable<Card> {
    private String rank;
    private String suit;
 public Card(String r, String s){
  rank=r;
  suit=s;}
public String rank(){
 return rank;}
    public String suit(){
     return suit;
    }
    public boolean equals(Object c){
        if(rank.equals(((Card)c).rank)&&suit.equals(((Card)c).suit)){return true;}
        else{return false;}}

    public int compareTo(Card other){
     if(rank.equals(other.rank)&&suit.equals(other.suit)){return 0;}
     else return -1;
    }
    public boolean isOfSuit(String s){
     if(s.equals(suit)){
         return true;}
     else return false;
    }
    public boolean stronger(Card c){
     if(Character.isAlphabetic(rank.charAt(0))&&Character.isDigit(c.rank.charAt(0))){return true;}
     else if(rank.charAt(0)>c.rank.charAt(0)&&!Character.isAlphabetic(rank.charAt(0))){return true;}
     else if(rank.equals("A")&&!rank.equals(c.rank)){return true;}
     else if(rank.equals("K")&&!c.rank.equals("A")&&!rank.equals(c.rank)){return true;}
     else if(rank.equals("Q")&&(!c.rank.equals("A")||!c.rank.equals("K"))&&!rank.equals(c.rank)){return true;}
     else if(rank.equals("J")&&(!c.rank.equals("A")||!c.rank.equals("K")||!c.rank.equals("Q"))&&!rank.equals(c.rank)){return true;}
     else if(rank.equals(c.rank)&&suit.equals("Spades")){return true;}
     else if(rank.equals(c.rank)&&suit.equals("Hearts")&&!c.suit.equals("Spades")){return true;}
     else if(rank.equals(c.rank)&&suit.equals("Diamonds")&&(!c.suit.equals("Spades")||!c.suit.equals("Hearts"))){return true;}
     else if(rank.equals(c.rank)&&suit.equals("Clubs")&&(!c.suit.equals("Spades")||!c.suit.equals("Hearts")||!c.suit.equals("Diamonds"))){return true;}
     else return false;}
    public String toString(){
     return rank+suit.charAt(0);
     }
     public static void main(String[] args){
     Card c1=new Card("10","Hearts");
     Card c2=new Card("Q","Spades");
     Scanner scan=new Scanner(System.in);
     String a=scan.next();
     String b=scan.next();
     Card c=new Card(a,b);
     System.out.println(c1);
     System.out.println(c2);
         System.out.println(c1.isOfSuit("Hearts"));
         System.out.println(c2.isOfSuit("Hearts"));
         System.out.println(c1.stronger(c2));
         System.out.println();
         System.out.println(c);
         System.out.println(c.isOfSuit("Hearts"));
         System.out.println(c.stronger(c2));
    }
}


