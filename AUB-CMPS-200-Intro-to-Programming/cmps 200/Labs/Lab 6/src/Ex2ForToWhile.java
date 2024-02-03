public class Ex2ForToWhile {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++) {
            for(int j =0; j < 10; j++)
                System.out.print("-");
            System.out.println(); }
        int i=0,j=0;
        while(i<5){
            while(j<10){
                j++;
                System.out.print("-");
            }
            System.out.println();
            i++;
            j=0;}
        }
    }

