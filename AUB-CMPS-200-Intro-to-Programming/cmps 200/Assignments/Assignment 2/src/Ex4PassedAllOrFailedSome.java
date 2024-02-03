public class Ex4PassedAllOrFailedSome {
    public static void main (String[] args){
        double grade1=Double.parseDouble(args[0]);
        double grade2=Double.parseDouble(args[1]);
        double grade3=Double.parseDouble(args[2]);
        if(grade1>=60&&grade2>=60&&grade3>=60){
            System.out.println("Passed all");
        }
        else{System.out.println("Failed some");}

    }
}
