public class Ex1BasicsRevisited {
    public static void main(String[] args){
       /* int: 4 bytes
        float: 4 bytes
        double: 8 bytes
        byte: 1 byte
        long: 8 bytes
        char: 2 bytes  */
        /* 1) int i = 10;
        byte b = i;
        error: since an integer holds more than a byte, we cannot convert an integer to byte
        2) byte b = 35;
           int j = b;
           no errors
         3) float f = 12.56F;
            double d = f;
            no errors
         4) double d = 12.67;
            float f = d;
            error: since a double holds more than a float, you cannot convert from a double to float
            fix it: Enter a decimal that is not casted as a double previously for example:
            double d=12.67;
            float f=12.67F;
          5) long l = 1234L;
             int i = l;
             error: since a long holds more than an integer, we cannot convert from long to integer
             fix it: long l=1234L;
             int i=1234;
          6) int i = 12456;
             long l = i;
              no errors
          7) int i = 12;
             char c = i;
             error: a number cannot be stored as a character. If we add '', we will store it
             as the letter i and not the value (integer) it holds
             int i=12;
             char c='i';
          8) char c = 'b';
             int i = c;
             double d = c;
             no errors. It will store the ASCII code of the character stored in the integer
             and then as a double
          9) What is printed by each of the following println statements?
             char c1 = 'f';
             char c2 = 'h';
             System.out.println(c1 - c2);//-2 (ASCII code of f - ASCII code of h)
             System.out.println(c2 / c1);//1 (ASCII code of h over ASCII code of f)
             System.out.println(c1.toUpperCase());=> error: c1 is a character(primitive data). It
             is not an object that has methods to apply on like toUpperCase()


         */



    }
}
