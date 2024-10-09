import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String player1 = "";
        String player2 = "";
        String done = "";

        boolean valid1 = false;
        boolean valid2 = false;
        boolean doneB = false;
        boolean validCont = false;

        do {

            do {
                System.out.print("Please enter Player 1's move: ");
                player1 = in.nextLine();
                if (player1.equalsIgnoreCase("R") || player1.equalsIgnoreCase("P")
                        || player1.equalsIgnoreCase("S")) {
                    valid1 = true;
                } else {
                    System.out.println("Please enter a valid move for Player 1");
                }
            } while (!valid1);

            do {
                System.out.print("Please enter Player 2's move: ");
                player2 = in.nextLine();
                if (player2.equalsIgnoreCase("R") || player2.equalsIgnoreCase("P")
                        || player2.equalsIgnoreCase("S")) {
                    valid2 = true;
                } else {
                    System.out.println("Please enter a valid move for Player 2");
                }
            } while (!valid2);

            if (player1.equalsIgnoreCase("R")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock! It's a tie!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock! Player 2 Wins!");
                } else {
                    System.out.println("Rock breaks Scissors! Player 1 Wins!");
                }
            }

            if (player1.equalsIgnoreCase("P")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock! Player 1 Wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper! It's a tie!");
                } else {
                    System.out.println("Scissors cuts Paper! Player 2 Wins!");
                }
            }

            if (player1.equalsIgnoreCase("S")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors! Player 2 Wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper! Player 1 Wins!");
                } else {
                    System.out.println("Scissors vs Scissors! It's a tie!");
                }
            }

            do {
                System.out.print("Would you like to continue? (Y/N): ");
                done = in.nextLine();
                if (done.equalsIgnoreCase("Y") || done.equalsIgnoreCase("N")) {
                    validCont = true;
                    if (done.equalsIgnoreCase("N")) {
                        doneB = true;
                    }
                } else {
                    System.out.println("Please enter a valid option");
                }
            } while (!validCont);
        } while (!doneB);
    }
}