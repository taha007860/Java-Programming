public class Ex7UniqueNumbers {
    public static void main(String[] args){
      System.out.println(uniqueNumbers(18,3,4));//3
        System.out.println(uniqueNumbers(7,6,6));//2
        System.out.println(uniqueNumbers(3,3,3));//1
    }
    public static int uniqueNumbers(int a,int b,int c){
        if(a==b&&a==c){return 1;}
        else if(a!=b&&a!=c&&b!=c){return 3;}
        else{return 2;}
    }
}
