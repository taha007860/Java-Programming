public class Ex1GuessTheOutput {
    public static void main(String[] args){
        int number = 10;
        while (number > 0) {
            System.out.println(number);
            number -= 1;
        }
        System.out.println(number);


/* Output:
10
9
8
7
6
5
4
3
2
1
0
 */
int n = 100;
for (n = 0; n < 5; n++)
        System.out.println(n);
        System.out.println(n);
/* Output:
0
1
2
3
4
5
 */
String str = new String("Quiz 1 Soon");
    int i = 0;
for (; i < str.length()-1; ++i) {
    System.out.println("At position " + ++i + " is " + str.charAt(i));
        System.out.println(i++);}
/* Output:
At position 1 is u
1
At position 4 is
4
At position 7 is S
7
At position 10 is n
10 */
int n1 = 10;
for (; n1 < 5; n1++)
        System.out.println(n1);
        System.out.println(n1);// Output: 10
    int i1 = 0, j, chars = 0;
    String s = "Loops are fun";
while (i1 < 5) {
        j =0;
        while(j < s.length()) {
        j++;
        chars++;}
        System.out.println("Loop: " + i1 + " characters: " + chars);
        i1++;}}}
/* Output:
Loop: 0 characters: 13
Loop: 1 characters: 26
Loop: 2 characters: 39
Loop: 3 characters: 52
Loop: 4 characters: 65
 */

