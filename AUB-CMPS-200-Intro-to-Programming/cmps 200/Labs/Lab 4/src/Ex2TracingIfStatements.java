public class Ex2TracingIfStatements {
    public static void main(String[] args){
        ifElse(3,25);//13 26
        ifElse(6,10);//7 11
        ifElse(5,5);}//6 5
        public static void ifElse(int x, int y){
            int z = 4;
            if (z <= x) {
                z = x + 1;}
            else {
                z = z + 9;}
            if (z <= y) {
                y = y + 1;}
            System.out.println(z + " " + y);
        }

}
