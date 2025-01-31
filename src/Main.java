//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        int number = 4; // You can change this to any positive integer
        long factorial = computeFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long computeFactorial(int n) {
        if ( n == 0 || n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);

        }
    }
}
