class Factorial {
    void printFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }
}

class FactCall {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        Factorial factorial = new Factorial();
        factorial.printFactorial(n);
    }
}