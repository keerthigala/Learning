package ExceptionHandling;

public class Program2 {
    public static void main(String args[]) {
        System.out.println("Program execution starts");
        int firstnumber = 6;
        int secondnumber = 0;
        int result = 0;
        try {
            result = firstnumber / secondnumber;
        }
        catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        finally {
            System.out.println("final block");
        }
        System.out.println("output is=" + result);
        System.out.println("Program execution ends");
    }
}

