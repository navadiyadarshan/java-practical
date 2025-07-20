class Student {
    String rollNo, name;
    int m1, m2, m3;
    void setDetails(String r, String n, int mark1, int mark2, int mark3) {
        rollNo = r;
        name = n;
        m1 = mark1;
        m2 = mark2;
        m3 = mark3;
    }

    void showResult() {
        int total = m1 + m2 + m3;
        float percentage = (float) ( total / 3);
        char grade;

        if (percentage >= 60) {
            grade = 'A';
        } else if (percentage >= 50) {
            grade = 'B';
        } else if (percentage >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

class StudentResultCall {

    public static void main(String[] args) {
        String rollNo = args[0];
        String name = args[1];
        int m1 = Integer.parseInt(args[2]);
        int m2 = Integer.parseInt(args[3]);
        int m3 = Integer.parseInt(args[4]);

        Student student = new Student();
        student.setDetails(rollNo, name, m1, m2, m3);
        student.showResult();
    }
}
