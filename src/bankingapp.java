import java.util.Scanner;

public class bankingapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int choice;
        int previouspin;
        int attempt;
        System.out.println("construct your pin");
       previouspin = getValidInt(scanner);
        bankingaccount  myAccount = new bankingaccount(previouspin);
        System.out.println("Your pin is "+previouspin);
        System.out.println("Enter your pin to continue");
        previouspin= getValidInt(scanner);
do {
            attempt = scanner.nextInt();
            if (!myAccount.checkPin(attempt)) {
                System.out.println("incorrect pin try again");
            } else {
                System.out.println("Your is pin correct!!");
            }
        } while (!myAccount.checkPin(attempt));

        System.out.println("Welcome to the banking app");
        while (run) {

            System.out.println("\nChoose from 1-4");
            System.out.println("1.Check balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {

                    System.out.printf("£%.2f%n", myAccount.getBalance());
                }
                case 2 -> {
                    System.out.println("Enter the deposit amount");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                }

                case 3 -> {
                    System.out.println("Enter the amount you want to withdraw");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);

                }
                case 4 -> run = false;
                default -> System.out.println("Invalid input Try again");
            }

        }
        scanner.close();

    }
    static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
       System.out.println("Error: Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
