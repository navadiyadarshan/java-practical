class Series {
    void printSeries(int n) {
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            if (i % 2 == 1) {
                result += 1.0 / factorial;
            } else {
                result -= 1.0 / factorial;
            }
        }
        System.out.println(result);
    }
}

class SeriesCall {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Series series = new Series();
        series.printSeries(n);
    }
}
