public class BMI
{
    public static double calculateBMI(double weight, double height){
                double bmi= weight/(height*height);
                return bmi;
    }
    public static void main(String[] args){
        double BMI= calculateBMI(75.0, 1.8);
        System.out.println("Your BMI is "+ BMI);//Your BMI is 23.148148148148145
    }
}
