import java.io.*;
public class FibonacciNumbers {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a value");
        int value = Integer.parseInt(br.readLine());
        long f1 = 0, f2 = 1;
        System.out.print(f1);
        System.out.print(f2);
        long f = f1 + f2;
        System.out.print(f);
        int count = 3;
        while (count < value) {
            f1 = f2;
            f2 = f;
            f = f1 + f2;
            System.out.print(f);
            count++;
        }
    }
}