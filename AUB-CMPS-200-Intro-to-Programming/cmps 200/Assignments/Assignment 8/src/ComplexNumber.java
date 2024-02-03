public class ComplexNumber {
    private double real;
    private double imaginary;
    private static double z2Real;
    private static double z2Imaginary;
    private static ComplexNumber z2=new ComplexNumber(z2Real, z2Imaginary);
    public ComplexNumber(double r, double i){
        real=r;
        imaginary=i;
    } public double getReal(){
        return real;
    } public double getImaginary(){
        return imaginary;
    } public void setReal(double re){
        real=re;
    } public void setImaginary(double imag) {
        imaginary = imag;
    } public ComplexNumber add(ComplexNumber z3){
        z2Real=z3.real;
        z2Imaginary=z3.imaginary;
        double realFinal=real+z2Real;
        double imaginaryFinal=imaginary+z2Imaginary;
        ComplexNumber zFinal=new ComplexNumber(realFinal,imaginaryFinal);
        return zFinal;
    } public ComplexNumber subtract(ComplexNumber z3){
        z2Real=z3.real;
        z2Imaginary=z3.imaginary;
        double realFinal=real-z2Real;
        double imaginaryFinal=imaginary-z2Imaginary;
        ComplexNumber zFinal=new ComplexNumber(realFinal,imaginaryFinal);
        return zFinal;
    } public ComplexNumber multiply(ComplexNumber z3){
        z2Real=z3.real;
        z2Imaginary=z3.imaginary;
        double realFinal=real*z2Real-imaginary*z2Imaginary;
        double imaginaryFinal=real*z2Imaginary+z2Real*imaginary;
        ComplexNumber zFinal=new ComplexNumber(realFinal,imaginaryFinal);
        return zFinal;
    } public ComplexNumber divide(ComplexNumber z3){
        z2Real=z3.real;
        z2Imaginary=z3.imaginary;
        double sum=z2Real*z2Real+z2Imaginary* z2Imaginary;
        double realFinal=((real*z2Real+imaginary*z2Imaginary)*1.0)/sum;
        double imaginaryFinal=((real*z2Imaginary+z2Real*imaginary)*1.0)/sum;
        ComplexNumber zFinal=new ComplexNumber(realFinal,imaginaryFinal);
        return zFinal;
    } public double magnitude(){
        double sum= real*real+imaginary*imaginary;
        double length=Math.sqrt(sum);
        return length;
    } public double phase(){
        double argument=Math.atan((imaginary*1.0)/real);
        double ans=(argument*180.0)/Math.PI;
        return ans;
    } public ComplexNumber conjugate(){
        double realcon=real;
        double imaginarycon=-imaginary;
        ComplexNumber zcon=new ComplexNumber(realcon,imaginarycon);
        return zcon;
    } public String toString(){
        String forReal=real+"";
        String forImag=imaginary+"";
        if(real==0&&imaginary==0){return "0";}
        else if(imaginary==0&&real!=0&&forReal.substring(forReal.indexOf(".")).charAt(1)=='0'&&forReal.substring(forReal.indexOf(".")).length()==2){return ((int)(real))+"";}
        else if(imaginary==0&&real!=0){return real+"";}
        else if(real==0&&imaginary>0&&imaginary!=1&&forImag.substring(forImag.indexOf(".")).charAt(1)=='0'&&forImag.substring(forImag.indexOf(".")).length()==2){return "i"+((int)(imaginary));}
        else if(real==0&&imaginary>0&&imaginary!=0){return "i"+imaginary;}
            else if(real==0&&imaginary<0&&imaginary!=-1&&forImag.substring(forImag.indexOf(".")).charAt(1)=='0'&&forImag.substring(forImag.indexOf(".")).length()==2){return "- i"+(Math.abs((int)(imaginary)));}
            else if(real==0&&imaginary<0&&imaginary!=-1){return "- i"+Math.abs(imaginary);}
            else if(real!=0&&imaginary>0&&imaginary!=1&&forImag.substring(forImag.indexOf(".")).charAt(1)=='0'&&forImag.substring(forImag.indexOf(".")).length()==2&&forReal.substring(forReal.indexOf(".")).charAt(1)=='0'&&forReal.substring(forReal.indexOf(".")).length()==2){return ((int)(real))+" + i"+((int)(imaginary));}
    else if(real!=0&&imaginary<0&&imaginary!=-1&&forImag.substring(forImag.indexOf(".")).charAt(1)=='0'&&forImag.substring(forImag.indexOf(".")).length()==2&&forReal.substring(forReal.indexOf(".")).charAt(1)=='0'&&forReal.substring(forReal.indexOf(".")).length()==2){return ((int)(real))+" - i"+Math.abs((int)(imaginary));}
    else if(real!=0&&imaginary>0&&imaginary!=1&&forImag.substring(forImag.indexOf(".")).charAt(1)=='0'&&forImag.substring(forImag.indexOf(".")).length()==2){return real+" + i"+((int)(imaginary));}
    else if(real!=0&&imaginary<0&&imaginary!=-1&&forImag.substring(forImag.indexOf(".")).charAt(1)=='0'&&forImag.substring(forImag.indexOf(".")).length()==2){return real+" - i"+Math.abs((int)(imaginary));}
    else if(real!=0&&imaginary>0&&imaginary!=1&&forReal.substring(forReal.indexOf(".")).charAt(1)=='0'&&forReal.substring(forReal.indexOf(".")).length()==2){return ((int)(real))+" + i"+imaginary;}
        else if(real!=0&&imaginary<0&&imaginary!=-1&&forReal.substring(forReal.indexOf(".")).charAt(1)=='0'&&forReal.substring(forReal.indexOf(".")).length()==2){return ((int)(real))+" - i"+Math.abs(imaginary);}
        else if(real!=0&&imaginary>0&&imaginary!=1){return (real+" + i"+(imaginary));}
        else if(real!=0&&imaginary<0&&imaginary!=-1){return (real+" - i"+Math.abs(imaginary));}
        else if(real!=0&&imaginary==1&&forReal.substring(forReal.indexOf(".")).charAt(1)=='0'&&forReal.substring(forReal.indexOf(".")).length()==2){return ((int)(real))+" + i";}
        else if(real!=0&&imaginary==1){return real+" + i";}
        else if(real!=0&&imaginary==-1&&forReal.substring(forReal.indexOf(".")).charAt(1)=='0'&&forReal.substring(forReal.indexOf(".")).length()==2){return ((int)(real))+" - i";}
        else if(real!=0&&imaginary==1){return real+" - i";}
        else{return "";}
    }}
