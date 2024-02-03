import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
public class Ex3Hangman {
    public static void main(String[] args) throws FileNotFoundException {
        Path q= Paths.get("words.txt");
        System.out.println(q.toAbsolutePath().toString());
        File f=new File(q.toAbsolutePath().toString());
        Scanner scan=new Scanner(f);
        Scanner console=new Scanner(System.in);
        ArrayList<String> wordList=new ArrayList<String>();
      while(scan.hasNext()){
          wordList.add(scan.next());
      }
      Collections.shuffle(wordList);
      String pickWord= wordList.get(0);
      int n=console.nextInt();
      System.out.println("Enter the maximum number of guesses: "+n);
      String x="";
      System.out.print("Word: ");
      for(int i=0;i<pickWord.length();i++){
          x=x+"_";
      }
      System.out.print(x);
      System.out.println();
      System.out.println("Misses: ");
      System.out.print("Guess: ");
      String guess=console.next();
      System.out.println();
      String r="";
      StringBuilder sb=new StringBuilder(x);
      String h="";
      int count1=0;
      int count=0;
        while(!x.equals(pickWord)){System.out.print("Word: ");
            r=x;
            for(int p=0;p<pickWord.length();p++){
            if(guess.equals(pickWord.charAt(p))||guess.equals((""+pickWord.charAt(p)).toLowerCase())){sb.setCharAt(p,guess.charAt(0));x=sb.toString();if(x.charAt(p)=='_'){count++;}}
            else if(x.charAt(p)=='_'){count++;}}
            System.out.print(x);
            System.out.println();
          if(x.equals(r)){h=h+guess+" "; System.out.println("Misses: "+h);count1++;}
          else{System.out.println("Misses: "+h);}
              System.out.print("Guess: ");
          guess=console.next();
        if(count1+1==n&&!pickWord.contains(guess.charAt(0)+"")){break;}
        if(count==1&&pickWord.contains(guess.charAt(0)+"")) {break;}
        count=0;
            }
            if(count==1&&pickWord.contains(guess.charAt(0)+"")){System.out.println("You Won! The word was: "+pickWord);}
             else if(count1+1==n&&!pickWord.contains(guess.charAt(0)+"")){System.out.println("You Lost! The word was: "+pickWord);}}}