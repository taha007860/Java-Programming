public class Ex1Strings {
    public static void main(String[] args){
        String text1="Chapter 1";
        String text2="Data Input";
        int a=text1.length();//a=9
        char b=text1.charAt(8);//b='1'
        char c=text1.charAt(0);//c='C'
        //char d=text1.charAt(9);//index out of range (error)
        int e=text1.indexOf("a");//e=2
        int f=text2.indexOf("t", 3);//f=9
        String g=text2.toUpperCase();//g="DATA INPUT"
        int h=text2.toLowerCase().indexOf("D");/* h=-1 (we transformed all the letters into lower case
        letters, so index of an upper case letter will not be found, so we write -1 */
        String i=text2.substring(5);//i="Input"
        String j=text2.substring(1, 6);//j="ata I"
        String k=text2.replace("a", "AA");//k="DAAtAA Input"
        String l="text2".replace("t", "T");//l="TexT2"
        //text2.charAt(1).toUpperCase();
        /* we can't do that since text.charAt(1) will be
        of type char which is a primitive data. For a primitive data, we can't apply to it .method()
        like objects */
System.out.println(a+"\n"+b+"\n"+c+"\n"+e+"\n"+f+"\n"+g+"\n"+h+"\n"+i+"\n"+j+"\n"+k+"\n"+l);
String s=text1.substring(a-1);// extract 1 as string
int z=Integer.parseInt(s);
int nextChapter = z+1;

    }
}
