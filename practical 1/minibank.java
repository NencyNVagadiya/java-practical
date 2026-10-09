import java.util.Scanner;

public class minibank {

    // Bank information
    static class BankInfo {
        private final String name;
        private final String branch;

        BankInfo(String name, String branch) {
            this.name = name;
            this.branch = branch;
        }

        String getName() {
            return name;
        }

        String getBranch() {
            return branch;
        }
    }

    // Menu options
    enum MenuOption {
        OPEN_ACCOUNT,
        DEPOSIT,
        WITHDRAW,
        TRANSFER,
        EXIT
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create BankInfo object
        BankInfo bank = new BankInfo("MiniBank", "Changa Branch");

        // Print header
        System.out.println("==========================");
        System.out.println(bank.getName());
        System.out.println("Branch: " + bank.getBranch());
        System.out.println("==========================");

        boolean running = true;

        // Menu loop
        while (running) {

            System.out.println("\n===== MiniBank Menu =====");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            String message;

            switch (choice) {
                case 1:
                    message = "Open Account - to be implemented in a later lab";
                    break;
                case 2:
                    message = "Deposit - to be implemented in a later lab";
                    break;
                case 3:
                    message = "Withdraw - to be implemented in a later lab";
                    break;
                case 4:
                    message = "Transfer - to be implemented in a later lab";
                    break;
                case 5:
                    running = false;
                    message = "Exit selected";
                    break;
                default:
                    message = "Invalid choice! Please enter 1 to 5.";
                    break;
            }

            System.out.println(message);
        }

        System.out.println("\nThank you for using MiniBank!");
        sc.close();
    }
}
