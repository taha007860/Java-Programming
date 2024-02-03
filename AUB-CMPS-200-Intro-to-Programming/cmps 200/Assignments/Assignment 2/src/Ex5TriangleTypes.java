public class Ex5TriangleTypes {
    public static void main(String[]args){
triangleType(1,2.2,5);
triangleType(3,3,3);
triangleType(2,1,2);
triangleType(1,2.1,3);
    }
    public static void triangleType(double side1,double side2,double side3){
        if((side1+side2>side3)&&(side2+side3>side1)&&(side1+side3>side2)&&side1>0&&side2>0&&side3>0){
         if(side1==side2&&side1==side3){System.out.println("Equilateral");}
         else if((side1==side2)||(side2==side3)||(side1==side3)){System.out.println("Isosceles");}
         else{System.out.println("Scalene");}
        }
        else{System.out.println("not a triangle (invalid input)");}
    }
}
