public class decimalToBinaryConverter {

    static void toBinary(int n) {
        int binaryNum[] = new int[50];
        int index = 1;

        while (n > 0) {
            binaryNum[index] = n % 2;
            n /= 2;
            index++;
        }
        for (int i = index - 1; i > 0; i--) {
            System.out.print(binaryNum[i]);
        }

    }

    public static void main(String[] args) {
        int n = 317;//example
        System.out.println("The binary equivalence of " + n + " is: ");
        toBinary(n);

    }
}
