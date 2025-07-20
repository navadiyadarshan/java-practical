
class Arithmnatic {
    void cal(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}

@SuppressWarnings("unused")
class ArithCall {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        Arithmnatic obj = new Arithmnatic();
        obj.cal(num1, num2);
    }
}