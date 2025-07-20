import java.io.*;

class NumberChecks {
    void checkPositiveNegative(int num) {
        if (num >= 0) {
            System.out.println(num + " is Positive");
        } else {
            System.out.println(num + " is Negative");
        }
    }

    void checkOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is Not Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is Not Prime");
                return;
            }
        }
        System.out.println(num + " is Prime");
    }

    void checkArmstrong(int num) {
        int original = num, sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}

class NumberCall {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        NumberChecks nc = new NumberChecks();
        int choice;

        do {
            System.out.println("\n--- Number Checks Menu ---");
            System.out.println("1. Check Positive or Negative");
            System.out.println("2. Check Odd or Even");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Check Armstrong Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(rd.readLine());

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter a number: ");
                int num = Integer.parseInt(rd.readLine());

                switch (choice) {
                    case 1:
                        nc.checkPositiveNegative(num);
                        break;
                    case 2:
                        nc.checkOddEven(num);
                        break;
                    case 3:
                        nc.checkPrime(num);
                        break;
                    case 4:
                        nc.checkArmstrong(num);
                        break;
                }
            } else if(choice != 5){
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}
