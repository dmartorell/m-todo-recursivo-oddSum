import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int num = 177; // El número se introduce manualmente en esta variable.

        if (num % 2 != 1) {
            System.out.println("Gimme an odd number, bitch!");
        } else {
            System.out.println("TOTAL: "+oddSum(num));
        }
    }
    public static int oddSum(int num) {
        if (num < 0) { // Caso base
            return 0;
        } else {
            System.out.println(num);
            int sum = num + oddSum(num-2); // Adonde vuelve cada método y suma el return.
            return sum;
        }
    }
}
