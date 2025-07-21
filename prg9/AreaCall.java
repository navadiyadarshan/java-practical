import java.io.*;

class AreaCalculator {
    void area(float radius) {
        float result = 3.1416f * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    void area(float length, float breadth) {
        float result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }
}

class AreaCall {
    public static void main(String args[]) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        AreaCalculator obj = new AreaCalculator();
        int choice;
        do {
            System.out.println("\n--- Area Calculator Menu ---");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(rd.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    float radius = Float.parseFloat(rd.readLine());
                    obj.area(radius);
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    float length = Float.parseFloat(rd.readLine());
                    System.out.print("Enter breadth of rectangle: ");
                    float breadth = Float.parseFloat(rd.readLine());
                    obj.area(length, breadth);
                    break;
                case 3:
                    System.out.print("Enter side of square: ");
                    int side = Integer.parseInt(rd.readLine());
                    obj.area(side);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while(choice != 4);
    }
}