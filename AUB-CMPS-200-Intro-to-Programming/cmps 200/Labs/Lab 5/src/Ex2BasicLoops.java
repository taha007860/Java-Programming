public class Ex2BasicLoops {
    public static void main (String[] args){
        //1)
        for(int i=0;i<=99;i=i+3){
            System.out.print(i+" ");
        }
        System.out.println();
        //2)
        System.out.println();
        int p=0;
            for(int j=100;j>=1;j--){
            System.out.print(j+" ");
            p++;
            if(p%5==0){System.out.println();}}
            System.out.println();

        //Or
       int c=100;
        for(int i=1;i<=20;i++){
            for(int j=1;j<=5;j++){
                System.out.print(c+" ");
                c--;
            }

        System.out.println();}
        System.out.println();
        //3)
        int o;
        for(int k=1;k<=50;k++){
            o=2*k-1;
            System.out.print(o+" ");
        }

        System.out.println();
        System.out.println();
        for(int s=1;s<=10;s++){
            System.out.print((s*s)+" ");
        }
            }}


