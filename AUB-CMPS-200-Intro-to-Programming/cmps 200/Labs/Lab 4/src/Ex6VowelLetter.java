import java.util.Scanner;
public class Ex6VowelLetter {
    public static void main (String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s=console.next();
        if(s.length()>1){System.out.print("Invalid. You entered more than one character.");}
            else { char c=s.charAt(0);
                if(Character.isAlphabetic(c)){
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                        System.out.print(c+" is a vowel letter");

                    }
                    else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                        System.out.print(c+" is a vowel letter");

                    }
                    else{
                        System.out.print(c+" is a consonant letter");

                    }
                }
                else{
                    System.out.print("Invalid. This is not an alphabet letter.");
                }

        }

    }
}
