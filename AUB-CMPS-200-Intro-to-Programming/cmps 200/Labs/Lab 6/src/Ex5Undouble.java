public class Ex5Undouble {
    public static void main(String[] args){
System.out.println(undouble("bookeeper"));
System.out.println(undouble("odegaard"));
System.out.println(undouble("oops"));
System.out.println(undouble("Mississippi"));

    }
    public static String undouble(String s){
        String h="";
    for(int i=0;i<s.length()-1;i++){
    if(s.charAt(i)==s.charAt(i+1)){s=s.substring(0,i)+s.substring(i+1);}
    }


    /*public static String undouble(String o){
        String g="";
        String temp="";
        String h="";
        int i;
        int j;
        int count=0;
        for(i=0;i<o.length();i++){
            if(o.charAt(i)!=o.charAt(i+1)){temp += o.charAt(i);}
            else if(o.charAt(i)==o.charAt(i+1)){temp=temp+o.charAt(i);break;}}
        for(j=i+2;j<o.length();j++){if(o.charAt(j)!=o.charAt(j+1)){temp += o.charAt(j);}
        else if(o.charAt(j)==o.charAt(j+1)){temp=temp+o.charAt(j);break;}}
        temp=temp+o.substring(j+2);
        return temp;}}
       for(i=0;i<o.length()-1;i++){
           if(o.charAt(i)==o.charAt(i+1)){count++}}
        for()*/

        h=s.charAt(0)+"";
        h=h.toLowerCase();
        s=s.replaceAll(s.charAt(0)+"",h);
        return s;}}








