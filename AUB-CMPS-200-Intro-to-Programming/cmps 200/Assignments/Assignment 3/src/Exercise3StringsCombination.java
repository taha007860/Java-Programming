public class Exercise3StringsCombination {
    public static void main(String[] args){
        String letters="abcde";
        String numbers="12345";
        for(int i=0;i<=letters.length()-1;i++){
            for(int j=0;j<=numbers.length()-1;j++){
                System.out.print(letters.charAt(i)+""+numbers.charAt(j)+" ");
            }
            System.out.println();

}}}
