class Circle {
    double PI = 3.14;

    void area(int r) {
        float area = (float) (PI * r * r);
        System.out.println("Area of circle: " + area);
    }

    void circumference(int r) {
        float circumference = (float) (2 * PI * r);
        System.out.println("Circumference of circle: " + circumference);
    }
}

@SuppressWarnings("unused")
class CircleCall {
    public static void main(String[] args) {
            int radius = Integer.parseInt(args[0]);
            Circle circle = new Circle();
            circle.area(radius);
            circle.circumference(radius);
    }
}
