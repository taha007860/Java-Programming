import java.util.*;
public class CardDeck {
    private Card[] cards;
    private int top;
    private static int count = 0;
    public CardDeck(Card[] a, int t){
        top=t;
        int l=0;
        cards=a;
        String[] rank={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit={"Clubs", "Diamonds", "Hearts", "Spades"};
        for(int i=0;i<rank.length&&l<52;i++){
            for(int j=0;j<suit.length;j++){
              a[l]=new Card(rank[i],suit[j]);
              l++;
            }
        }
    }
    public boolean isEmpty(){
        if(count==52||cards.length==0){return true;}
        else return false;
    }
    public int cardsLeft(){
        return cards.length-top;
    }
    public void shuffle(){
        Random rand=new Random();
        int g=rand.nextInt(52);
        for(int i=0;i<cards.length;i++){
            Card temp=cards[i];
          cards[i]=cards[g];
          cards[g]=temp;
        }
    }
    public Card draw(){
        return cards[top];
    }
    public String toString(){
        return Arrays.toString(cards);
    }
    public static void main(String[] args){
        Card[] f=new Card[52];
        int u=0;
        CardDeck s=new CardDeck(f,u);
        System.out.println(s);
        s.shuffle();
        System.out.println(s);
        Card a=new Card("A","Spades");
        Card b=new Card("A","Clubs");
        Card d=new Card("A","Hearts");
        Card e=new Card("A","Diamonds");
        boolean r=true;
        System.out.println("52");
          while(r){
              if(f[s.top].compareTo(a)==0||f[s.top].compareTo(b)==0||f[s.top].compareTo(d)==0||f[s.top].compareTo(e)==0){r=false;}
              s.draw();
              s.top++;
              System.out.println(s.cardsLeft());
          }
          System.out.println("Cards drawn: "+s.top);


    }

    }

