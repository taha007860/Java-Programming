public class StringMethods {
    public static void main(String[] args){
        String s= "Programming is fun!";
        int l= s.length();
        char c= s.charAt(0);
        char c1= s.charAt(l-1);
        String sub= s.substring(4);
        char c2= s.charAt(5);
        char c3= s.charAt(11);
        String up= s.toUpperCase();
        int k= s.indexOf("f");
        System.out.println(l);//19
        System.out.println(c);//P
        System.out.println(c1);//!
        System.out.println(sub);//ramming is fun!
        System.out.println(c2);//a
        System.out.println(c3);//
        System.out.println(up);//PROGRAMMING IS FUN!
        System.out.println(k);//15


    }
}
