public class Exercise6Pattern {
    public static void main(String[] args){
        int n=(int)(Math.random()*100+1);
        System.out.println(n);
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=i;j++){System.out.print((int)(Math.pow(3,j))+" ");}
            for(int k=i-1;k>=0;k--){
                System.out.print((int)(Math.pow(3,k))+" ");
            }
            System.out.println();
            }
        }
    }

