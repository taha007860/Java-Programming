public class OneCrayon {
        public static void dash(){
            System.out.println("+------+");

        }
        public static void slash(){
            System.out.println("|      |");

        }
        public static void combine(){
            dash(); slash(); slash();dash();
        }
        public static void aub(){
            System.out.println("| AUB  |");

            }

        public static void main (String[] args){
            System.out.println(" ------");
            slash(); combine();aub();aub();combine();
            System.out.println(" \\    / ");
            System.out.println("  \\  / ");
            System.out.println("   \\/   ");
        }
    }

