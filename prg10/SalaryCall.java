import java.io.*;

class SalaryCalculator {
    void salary(float basic, float da) {
        float net = basic + da;
        System.out.println("Peon Net Salary: " + net);
    }

    void salary(float basic, float da, float hra, float it) {
        float gross = basic + da + hra;
        float net = gross - it;
        System.out.println("Jr Executive Net Salary: " + net);
    }

    void salary(float basic, float da, float hra, float pf, float it) {
        float gross = basic + da + hra;
        float net = gross - (pf + it);
        System.out.println("Executive Net Salary: " + net);
    }

    void salary(float basic, float da, float hra, float ma, float pf, float it, float pt) {
        float gross = basic + da + hra + ma;
        float net = gross - (pf + it + pt);
        System.out.println("Manager Net Salary: " + net);
    }
}

class SalaryCall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SalaryCalculator sc = new SalaryCalculator();
        int choice;

        do {
            System.out.println("\n--- Salary Calculator ---");
            System.out.println("1. Manager");
            System.out.println("2. Executive");
            System.out.println("3. Jr Executive");
            System.out.println("4. Peon");
            System.out.println("5. Exit");
            System.out.print("Enter your role (1-5): ");

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Basic Salary: ");
                    float basicM = Float.parseFloat(br.readLine());
                    System.out.print("Enter DA Salary: ");
                    float daM = Float.parseFloat(br.readLine());
                    System.out.print("Enter HRA Salary: ");
                    float hraM = Float.parseFloat(br.readLine());
                    System.out.print("Enter MA Salary: ");
                    float maM = Float.parseFloat(br.readLine());
                    System.out.print("Enter PF Salary: ");
                    float pfM = Float.parseFloat(br.readLine());
                    System.out.print("Enter IT Salary: ");
                    float itM = Float.parseFloat(br.readLine());
                    System.out.print("Enter PT Salary: ");
                    float ptM = Float.parseFloat(br.readLine());
                    sc.salary(basicM, daM, hraM, maM, pfM, itM, ptM);
                    break;

                case 2:
                    System.out.print("Enter Basic Salary: ");
                    float basicE = Float.parseFloat(br.readLine());
                    System.out.print("Enter DA Salary: ");
                    float daE = Float.parseFloat(br.readLine());
                    System.out.print("Enter HRA Salary: ");
                    float hraE = Float.parseFloat(br.readLine());
                    System.out.print("Enter PF Salary: ");
                    float pfE = Float.parseFloat(br.readLine());
                    System.out.print("Enter IT Salary: ");
                    float itE = Float.parseFloat(br.readLine());
                    sc.salary(basicE, daE, hraE, pfE, itE);
                    break;

                case 3:
                    System.out.print("Enter Basic Salary: ");
                    float basicJ = Float.parseFloat(br.readLine());
                    System.out.print("Enter DA Salary: ");
                    float daJ = Float.parseFloat(br.readLine());
                    System.out.print("Enter HRA Salary: ");
                    float hraJ = Float.parseFloat(br.readLine());
                    System.out.print("Enter IT Salary: ");
                    float itJ = Float.parseFloat(br.readLine());
                    sc.salary(basicJ, daJ, hraJ, itJ);
                    break;

                case 4:
                    System.out.print("Enter Basic Salary: ");
                    float basicP = Float.parseFloat(br.readLine());
                    System.out.print("Enter DA Salary: ");
                    float daP = Float.parseFloat(br.readLine());
                    sc.salary(basicP, daP);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);
    }
}
