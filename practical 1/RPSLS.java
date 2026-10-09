import java.util.Random;
import java.util.Scanner;

public class RPSLS {

    // Check who wins
    static int winner(String player, String computer) {

        if (player.equals(computer)) {
            return 0; // Tie
        }

        if (player.equals("ROCK")) {
            if (computer.equals("SCISSORS") || computer.equals("LIZARD"))
                return 1;
            else
                return -1;
        }

        if (player.equals("PAPER")) {
            if (computer.equals("ROCK") || computer.equals("SPOCK"))
                return 1;
            else
                return -1;
        }

        if (player.equals("SCISSORS")) {
            if (computer.equals("PAPER") || computer.equals("LIZARD"))
                return 1;
            else
                return -1;
        }

        if (player.equals("LIZARD")) {
            if (computer.equals("SPOCK") || computer.equals("PAPER"))
                return 1;
            else
                return -1;
        }

        if (player.equals("SPOCK")) {
            if (computer.equals("SCISSORS") || computer.equals("ROCK"))
                return 1;
            else
                return -1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int you = 0;
        int computer = 0;

        String[] moves = {
            "ROCK",
            "PAPER",
            "SCISSORS",
            "LIZARD",
            "SPOCK"
        };

        // Play 5 rounds
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nRound " + i);
            System.out.println("Choose: ROCK, PAPER, SCISSORS, LIZARD, SPOCK");
            System.out.print("Enter your move: ");

            String player = sc.next().toUpperCase();

            // Check valid input
            if (!player.equals("ROCK") &&
                !player.equals("PAPER") &&
                !player.equals("SCISSORS") &&
                !player.equals("LIZARD") &&
                !player.equals("SPOCK")) {

                System.out.println("Invalid move! Try again.");
                i--;
                continue;
            }

            // Computer chooses randomly
            String comp = moves[random.nextInt(5)];

            System.out.println("You: " + player);
            System.out.println("Computer: " + comp);

            int result = winner(player, comp);

            if (result == 1) {
                System.out.println("You win!");
                you++;
            }
            else if (result == -1) {
                System.out.println("Computer wins!");
                computer++;
            }
            else {
                System.out.println("Tie!");
            }
        }

        // Final score
        System.out.println("\n--------------------");
        System.out.println("Final Score");
        System.out.println("You: " + you);
        System.out.println("Computer: " + computer);

        if (you > computer) {
            System.out.println("🏆 You are the winner!");
        }
        else if (computer > you) {
            System.out.println("💻 Computer is the winner!");
        }
        else {
            System.out.println("It's a tie!");
        }

        sc.close();
    }
}
