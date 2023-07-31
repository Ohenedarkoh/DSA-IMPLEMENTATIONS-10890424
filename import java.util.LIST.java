import java.util.List;

public class Factorial {

    public static List<Integer> factorial(int n) {
        List<Integer> factorials = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            factorials.add(i);
        }
        return factorials;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
    }
}
