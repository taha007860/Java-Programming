public class ComplexClient {
    public static void main(String[] arg){
      ComplexNumber z1=new ComplexNumber(2,3);
      ComplexNumber z2=new ComplexNumber(4,1);
      System.out.println(z1.getReal());
      System.out.println(z2.getImaginary());
      z1.setReal(1);
      z2.setImaginary(2);
      System.out.println(z1.add(z2));
      System.out.println(z2.add(z1));
        System.out.println(z1.subtract(z2));
        System.out.println(z2.subtract(z1));
        System.out.println(z1.multiply(z2));
        System.out.println(z2.multiply(z1));
        System.out.println(z1.divide(z2));
        System.out.println(z2.divide(z1));
        System.out.println(z1.magnitude());
        System.out.println(z2.magnitude());
        System.out.println(z1.phase());
        System.out.println(z2.phase());
        System.out.println(z1.conjugate());
        System.out.println(z2.conjugate());
        System.out.println(z1);

    }
}
