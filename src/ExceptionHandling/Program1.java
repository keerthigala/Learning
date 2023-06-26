package ExceptionHandling;

public class Program1 {
    public static void main(String args[]) {
        System.out.println("Program execution starts");
        int firstnumber = 6;
        int secondnumber = 2;
        int result = 0 ;
        try {
            result = firstnumber / secondnumber;
        }
        catch(ArithmeticException ae) {
            System.out.println(ae.toString());
        }
        finally {
            System.out.println("final block");
        }
        System.out.println("output is=" + result);
        System.out.println("Program execution ends");
    }
}
