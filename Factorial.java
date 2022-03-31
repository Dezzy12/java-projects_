public class Factorial {
    public static void main(String[] args) {
        int n = 5; //example
        int factorial = 1;

        for (int i = 1; i <= n; i++)
            factorial *= i;
        System.out.println(n + "! is equal to: " + factorial);

    }
}
