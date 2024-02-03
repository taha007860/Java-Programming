package lab1.crayons;

public class Crayons{
    public static void dash(){
        System.out.print("+------+");
        System.out.print("+------+");
        System.out.println();
    }
    public static void slash(){
        System.out.print("|      |");
        System.out.print("|      |");
        System.out.println();
    }
    public static void combine(){
        dash(); slash(); slash(); dash();
    }
    public static void aub(){
        System.out.print("| AUB  |");
        System.out.print("| AUB  |");
        System.out.println();}

    public static void main (String[] args){
        System.out.print(" ------");
        System.out.print("  ------");
        System.out.println();
        slash(); combine(); aub(); aub(); combine();
        System.out.println(" \\    /  \\    /");
        System.out.println("  \\  /    \\  /");
        System.out.println("   \\/      \\/");
    }
}