package lab1.flowofcontrol;

public class FlowOfControl {
    public static void main(String [] args){
        method_1();
        method_2();
        method_3();
        /* Output:
Greetings from method 1
Greetings from method 2
Greetings from method 1
Greetings from method 3
Greetings from method 1
Greetings from method 2
Greetings from method 1
         */
    }
    public static void method_1(){
        System.out.println("Greetings from method 1");
    }
    public static void method_2(){
        System.out.println("Greetings from method 2");
        method_1();
    }
    public static void method_3(){
        System.out.println("Greetings from method 3");
        method_1();
        method_2();
    }
}
