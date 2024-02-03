import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList <PhoneEntry> p = new ArrayList<PhoneEntry>();

    public void addEntry(String name, String phoneNum){
        PhoneEntry a = new PhoneEntry();
        a.name =name;
        a.phoneNum= phoneNum;
        p.add(a);
    }
    public String getNumber(String name){
        for(int i =0; i<p.size();i++){
            if(p.get(i).name.equals(name))
                return p.get(i).phoneNum;
        }
        return null;
    }
    public void load (String filename) throws FileNotFoundException {
        PhoneEntry a = new PhoneEntry();
        Scanner in = new Scanner(new File("C:\\Users\\USAID\\AppData\\Local\\Temp\\Rar$DIa20956.14252\\Numbers\\Numbers.txt"));
        String name = "";
        String number = "";
        while(in.hasNextLine()){
            String s = in.nextLine();
            Scanner input = new Scanner(s);
            name += input.next();
            name += input.next();
            input.next();
            number = input.next();
        }
        a.name = name;
        a.phoneNum = number;
    }
    public void save (String filename) throws FileNotFoundException{
        PrintStream p1 = new PrintStream(filename);
        for(int i = 0; i<p.size(); i++)
            p1.println(p.get(i));
    }
}
