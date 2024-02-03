/*import java.util.*;
public class Ex7LongestSubstring {
    public static void main(String[] args){*/
       /* int indexa= 0;
        int indexz =0;
        int longest=0;
        int counter=0;
        int count =1;
        Scanner console=new Scanner(System.in);
        System.out.print("enter a string:");
        String s=console.nextLine();
        String d=s;
        String h=s;
        String f="";
        int e=0;

        int i;
        char c='b';
        for(int o=0){
        for(int k=0;k<=s.length()-1;k++){
        for(i=0;i<=k-1;i++){
            c=s.charAt(i);
            }
        for(int t=1;c!='a';t++)
        if(c=='a'&&s.charAt(s.indexOf("a")+1)!='a'){indexa=s.indexOf("a");}
        else if(c=='a'&&s.charAt(s.indexOf("a")+1)=='a'){indexa=s.indexOf("a")+1;}
                                                           }
                if(s.charAt(i)=='z'){indexz=s.indexOf("z");
                    d=s.substring(indexa,indexz+1);
                }
                d=Math.max(d,e);
                e=d;
               while(c=='z'){s=s.substring(indexz+1);
                             count++;}
               if(c==s.charAt(s.length()-1)){count=0;}}
        System.out.println(d);
                for(int p=0;p<=s.length()-1;p++){
                    for(i=0;i<=p-1;i++){
                        c=s.charAt(i);
                    }
                    if(c=='a'&&s.charAt(s.indexOf("a")+1)!='a'){indexa=s.indexOf("a");}
                    else if(c=='a'&&s.charAt(s.indexOf("a")+1)=='a'){indexa=s.indexOf("a")+1;}
                    if(s.charAt(i)=='z'){indexz=s.indexOf("z");
                        f=s.substring(indexa,indexz+1);
                        }}
                    if(d.length()>f.length()){System.out.println(d.length());}
                        else{System.out.println(f.length());}
                }}
       String d=s;
        s=d.substring(d.indexOf("a"),d.indexOf("z")+1);
        l=s.length();
        System.out.println(l);
        s=d.substring(d.indexOf("z")+1);
        s=s.substring(s.indexOf("a"),s.indexOf("z")+1);
        l=s.length();
        System.out.println(l);}}*/
       /* int longest=0;
        int l=1;
        char c='k';
        int k=0;
        boolean o=false;
        int x=0;
        int p;
        int t=0;
        Scanner console=new Scanner(System.in);
        String s=console.nextLine();
        String r=s;
        boolean b=false;
        char g='d';
        boolean v=false;
        char d;
        /*for(int i=0;i<=r.length()-1;i++){
            char n=r.charAt(i);
        while(n!=r.charAt(r.length()-1)){
        for(int j=s.indexOf("a");j<=s.indexOf("z");j++){
            char v=s.charAt(j);
            if(v=='z'&&'z'!=r.charAt(r.length()-1)){l++;s=s.substring(s.indexOf("z")+1);
                                                     b=true;}
        if(b==true){for(int q=s.indexOf("z")+1;q<=s.indexOf("a");q++){
            char m=s.charAt(q);
            if(m=='a'&&'a'!=r.charAt(r.length()-1)){l++;s=s.substring(s.indexOf("a")*/
       /* int i;
        for(i=1;i<=l;i++){
            for(int h=0;h<=r.length()-1;h++) {
                d=r.charAt(h);
                if(d=='a'){s=s.substring(s.indexOf("a")+1);}
                if(d=='z'){s=s.substring(s.indexOf("z")+1);}
                for(int w=s.indexOf("a")+1;w<=s.indexOf("z")-1;w++){
                    g=r.charAt(w);
                    if(g!='a'&&g!='z'){o=true;}}
                if(o==true){l++;}
            if(d==r.charAt(r.length()-1)){v=true;}}
            if(v=true){i=i+5;}}


        for(int let=1;let<=l;let++){
            for(int j=r.indexOf("a")+1;j<=r.indexOf("z")-1;j++){
                c=r.charAt(j);
                if(c!='a'&&c!='z'){b=true;}
                if(b==true){k++;}}
                 k=k+2;
            if(longest<k){longest=k;}
            r=r.substring(r.indexOf("z")+1);

             k=0;
        b=false;}
          System.out.println(longest);}}*/
import java.util.Scanner;
public class Ex7LongestSubstring{
public static void main(String[] args){
    Scanner console=new Scanner(System.in);
String s=console.nextLine();
String longest="";
String temp="";
for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='a')temp="a";
    else if(s.charAt(i)=='z'&&temp.length()>0){
        temp+="z";
        if(longest.length()<temp.length()){longest=temp;}temp="";}
    else if(temp.length()>0)temp+=s.charAt(i);}
System.out.println(longest);
    }
}







