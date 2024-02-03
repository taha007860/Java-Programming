public class PrimeNumber {
    public static void main (String[] args) {
      try {
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(7));
        System.out.println(isPrime(12));
        System.out.println(isPrime(9));
      }
      catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
    public static boolean isPrime(int a) throws Exception {
        if(a < 0) {
            throw new Exception("Prime numbers cannot be negative");
        }
        else if(a == 0 || a == 1) {
            return false;
        }
        else if(a == 2) {
            return true;
        }
        else {
            for (int i=2; i<a; i++) {
               if(a%i==0) {
                return false;
               }
            }
            return true;
        }
    }
}
