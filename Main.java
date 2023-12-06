import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int balance = 0;
        int choice, amount;

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("WELCOME TO ATM SERVICE.");
            System.out.println("ATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount of deposit: ");
                    amount = scanner.nextInt();
                    balance += amount; 
                    System.out.println("Deposit of " + amount + " is successful. Your new balance is: " + balance);
                    break;
                case 3:
                    System.out.println("Enter amount of withdraw: ");
                    amount = scanner.nextInt();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal of " + amount + " is successful. Your new balance is: " + balance);
                    } else {
                        System.out.println("Withdrawal failed. Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM service!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
