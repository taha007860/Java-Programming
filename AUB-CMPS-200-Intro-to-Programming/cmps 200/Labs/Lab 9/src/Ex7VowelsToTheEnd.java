public class Ex7VowelsToTheEnd {
    public static void main(String[] args){
 vowelsToEnd("beauty");
 System.out.println();
 vowelsToEnd("cluster");
    } public static void vowelsToEnd(String str){
        if(str.length()==0){
            System.out.print("");
        }
        else if(str.charAt(0)!='a'&&str.charAt(0)!='o'&&str.charAt(0)!='u'&&str.charAt(0)!='i'
                &&str.charAt(0)!='e'){
            System.out.print(str.charAt(0));
            vowelsToEnd(str.substring(1));
        }
        else{
            vowelsToEnd(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
}
