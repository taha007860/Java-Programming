import java.util.*;
public class Ex4RockPaperScissors {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        String d="";
        int c=0;
        int k=0;
        int g=0;
        do{System.out.print("Rock, Paper, or Scissors? ");
            String s=console.next();
            System.out.println("Player: "+s);
            System.out.print("Computer: ");
            Random rand=new Random();
            int r=rand.nextInt(3);
            if(r==0){System.out.println("Scissors");}
            else if(r==1){System.out.println("Paper");}
            else{System.out.println("Rock");}
            System.out.print("Winner: ");
            if(s.equals("Rock")&&r==0){System.out.println("Player");
                                       c++;}
            else if(s.equals("Rock")&&r==1){System.out.println("Computer");
                                            k++;}
            else if(s.equals("Rock")&&r==2){System.out.println("It's a tie");
                                           g++;}
            if(s.equals("Paper")&&r==0){System.out.println("Computer");
                                        k++;}
            else if(s.equals("Paper")&&r==1){System.out.println("It's a tie");
                                              g++;}
            else if(s.equals("Paper")&&r==2){System.out.println("Player");
                                             c++;}
            if(s.equals("Scissors")&&r==0){System.out.println("It's a tie");
                                           g++;}
            else if(s.equals("Scissors")&&r==1){System.out.println("Player");
                                                 c++;}
            else if(s.equals("Scissors")&&r==2){System.out.println("Computer");
                                                k++;}
            System.out.print("Again? (yes/no) ");
            d=console.next();
        } while(d.equals("yes"));
        if(d.equals("no")){System.out.println("**************");}
            System.out.println("Wins: "+c);
            System.out.println("Losses: "+k);
            System.out.println("Ties: "+g);
            System.out.println("**************");


    }
}
