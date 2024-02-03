import java.util.*;
public class Ex1Basics {
    public static void main(String[] args){
        int[] numbers = new int[10];//{0,0,0,0,0,0,0,0,0,0}
        System.out.println(Arrays.toString(numbers));
        numbers[2] = 4;//{0,0,4,0,0,0,0,0,0,0}
        System.out.println(Arrays.toString(numbers));
        numbers[5] = 55;//{0,0,4,0,0,55,0,0,0,0}
        System.out.println(Arrays.toString(numbers));
        numbers[7] = 1;//{0,0,4,0,0,55,0,1,0,0}
        System.out.println(Arrays.toString(numbers));
        int x = numbers[2];//x=4
        numbers[x] = 88;//{0,0,4,0,88,55,0,1,0,0}
        System.out.println(Arrays.toString(numbers));
        numbers[numbers[7]] = 11;//{0,11,4,0,88,55,0,1,0,0}
        System.out.println(Arrays.toString(numbers));
    }
}
