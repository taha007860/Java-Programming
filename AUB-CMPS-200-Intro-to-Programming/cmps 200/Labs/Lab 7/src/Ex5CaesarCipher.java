public class Ex5CaesarCipher {
    public static void main(String[] args){
        System.out.println(cipher("Caesar", 4));
        System.out.println(cipher("West OR East", 5));
    } public static String cipher(String s, int x){
        String k="";
        char d='s';
        for(int i=0;i<=s.length()-1;i++){
            char c=s.charAt(i);
          if(Character.isAlphabetic(c)&&c+x>'Z'&&Character.isUpperCase(c)){d=(char)('A'+(x-('Z'-c))-1);}
          else if(Character.isAlphabetic(c)&&c+x>'z'&&Character.isLowerCase(c)){d=(char)('a'+(x-('z'-c))-1);}
          else if(Character.isAlphabetic(c)){d=(char)(c+x);}
          else{d=c;}
           k=k+d;}
         return k;
    }}

