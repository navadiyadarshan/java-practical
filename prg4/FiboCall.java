class Fibonacci {
    public void printFibonacciSeries(int count) {
        int a = 0, b = 1, c;
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

class FiboCall {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciSeries(count);
    }
}
