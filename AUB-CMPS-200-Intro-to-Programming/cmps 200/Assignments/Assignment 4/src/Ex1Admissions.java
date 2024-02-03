import java.util.Scanner;
public class Ex1Admissions {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        intro();
        System.out.println("Information for the first applicant:");
        System.out.print("Full Name: ");
        String r=console.nextLine();
        double n=SATOrACT(console);
        double f=GPA(console);
        System.out.println("Information for the second applicant:");
        System.out.print("Full Name: ");
        String j=console.next();
        String s=console.next();
        double z=SATOrACT(console);
        double d=GPA(console);
        System.out.printf(r+" 's overall average = %.4f\n",(n+f));
        System.out.printf(j+" "+s+" 's overall average = %.4f\n",(z+d));
        if((n+f)>(z+d)){System.out.println("It seems "+r+" is the best applicant");}
            else{System.out.println("It seems "+j+" "+s+" is the best applicant");}}
    public static void intro(){
        System.out.println("-------------------------------------------------------");
        System.out.println("This program will compare two candidates and determine");
        System.out.println("which one to be admitted to the department!");
        System.out.println("-------------------------------------------------------");
    } public static double SATOrACT(Scanner console){
        System.out.print("SAT (1) or ACT (2)? ");
        int a=console.nextInt();
        if(a==1){return SAT(console);}
        else {return ACT(console);}}
    public static double SAT(Scanner console){
        System.out.print("SAT Math?: ");
        int i=console.nextInt();
        if(i<200||i>800){console.close();}
        System.out.print("SAT Verbal?: ");
        int k=console.nextInt();
        if(k<200||k>800){console.close();}
         return SATCalculate(k,i);}
    public static double ACT(Scanner console){
        System.out.print("ACT English?: ");
        int e=console.nextInt();
        if(e<1||e>36){console.close();}
        System.out.print("ACT Math?: ");
        int o=console.nextInt();
        if(o<1||o>36){console.close();}
        System.out.print("ACT Reading?: ");
        int q=console.nextInt();
        if(q<1||q>36){console.close();}
        System.out.print("ACT Science?: ");
        int h=console.nextInt();
        if(h<1||h>36){console.close();}
         return ACTCalculate(q,e,o,h);}
    public static double SATCalculate(int v,int m){
        double SATScore=(2*v+m)/24.0;
    return SATScore;}
    public static double ACTCalculate(int r,int e,int m,int s){
        double ACTScore=(2*r+e+m+s)/1.8;
        return ACTScore;}
    public static double GPA(Scanner console){
        System.out.print("Overall GPA? ");
        double y=console.nextDouble();
        if(y<0||y>4){console.close();}
        System.out.print("Maximum GPA? ");
        double t=console.nextDouble();
        if(y<0||y>4.0){console.close();}
        double g=(y*1.0/t)*100;
        return g;}}
