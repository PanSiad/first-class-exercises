import java.util.Scanner;

public class HarmonicSeries {

    public static void main() {

//        long n = 144;
        double sum = 0;

        System.out.println("Please enter an integer: ");
        //Read input from console
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //convert string to integer
        int n = Integer.parseInt(s);

        for (double i = 1; i <= n; i++) {
            sum += 1/i;
        }

        System.out.println("For the given number " + n + ", the sum of the harmonic series up to n is: " + sum);
    }
}
