public class Tracing
{
    public static void main(String [] args) {
        int first = 34;
        int second = 50;
        first = first + 10;
        second = first;
        first = 50;
        second = second + 3 + first;
        second = second / 2;

        //first=50
        //second=48
    }

}


