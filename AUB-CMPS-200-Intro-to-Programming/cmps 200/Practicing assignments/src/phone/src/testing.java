import java.io.*;

public class testing {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream p1=new PrintStream(new File("tryFile.txt"));
        PhoneBook p=new PhoneBook();
        p.addEntry("Nour Sfeir", "0123");
        System.out.println(p.getNumber("Nour Sfeir"));
        p.load("tryFile.txt");
        p.save("tryFile.txt");
    }
}
