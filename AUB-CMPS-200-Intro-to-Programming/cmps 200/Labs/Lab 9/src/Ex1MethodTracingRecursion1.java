public class Ex1MethodTracingRecursion1 {
    public static void main(String[] args){
        mystery1(35, 14);
        System.out.println();
        mystery1(5, 8);}
        public static void mystery1(int x, int y){
            if (y <= 0)
                System.out.print("0");
            else if(x > y)
            {
                System.out.print(x + " ");
                mystery1(x - y, y);
            }
            else
            {
                mystery1(x, y - x);
                System.out.print(y + " ");
            }
        }

    } //35 21 07 14
//5 2 01 3 8
