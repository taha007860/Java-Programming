import java.io.FileNotFoundException;
public class PhoneBookClient {
    public static void main(String[] args) throws FileNotFoundException {
        PhoneBook p = new PhoneBook();
        p.addEntry("A7la Nour Sfeir","01234567");
        System.out.println(p.getNumber("A7la Nour Sfeir"));
        p.load("Numbers.txt");
        p.save("Numbers.txt");
    }
}
