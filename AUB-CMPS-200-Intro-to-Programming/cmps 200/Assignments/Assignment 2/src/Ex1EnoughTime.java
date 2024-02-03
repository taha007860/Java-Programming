public class Ex1EnoughTime {
    public static void main(String[] args){
        int h3=Integer.parseInt(args[0]);
        int m3=Integer.parseInt(args[2]);
        int h4=Integer.parseInt(args[3]);
        int m4=Integer.parseInt(args[5]);
boolean b=enough_Time(h3,m3,h4,m4);
System.out.println(b);
if(m3<0||m3>=59||m4<0||m4>=59||h3<0||h3>=24||h4<0||h4>=23){
    System.out.println("Why false? Since invalid time input");}
}

    public static boolean enough_Time(int h1,int m1,int h2, int m2){
        int a=0;
        a=60-m1;
        if(m1>=0&&m1<=59&&m2>=0&&m2<=59&&h1>=0&&h1<=23&&h2>=0&&h2<=23){
        if(h1>h2){return false;}
        else if(h1==h2&&m2<m1){return false;}
        else if(h1<h2&&m2>m1) {return true;}
        else if(h1<h2&&m1>m2&&a+m2>40){return true;}
        else{return false;}

            }
        else{return false;}



    }
}
