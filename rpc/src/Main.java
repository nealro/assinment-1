import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] moves = {"Rock", "Paper", "Scissors"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************************");


        int playerScore = 0;
        int computerScore = 0;

        while (true) {

            System.out.println("Scores - Player: " + playerScore + ", Computer: " + computerScore);

            System.out.print("Enter your move (Rock, Paper, or Scissors): ");
            String playerMove = scanner.nextLine();


            if (!isValidMove(playerMove)) {
                System.out.println("Invalid move. Please enter Rock, Paper, or Scissors.");
                continue;
            }


            String computerMove = getRandomMove(moves);


            System.out.println("Player's move: " + playerMove);
            System.out.println("Computer's move: " + computerMove);


            String result = determineWinner(playerMove, computerMove);
            System.out.println(result);


            if (result.contains("Player wins")) {
                playerScore++;
            } else if (result.contains("Computer wins")) {
                computerScore++;
            }





            if (playerScore == 5 || computerScore == 5) {
                System.out.println("Game over!");
                if (playerScore == 5) {
                    System.out.println("Player wins the game!");
                } else {
                    System.out.println("Computer wins the game!");
                }
                break;
            }


        }


        scanner.close();
    }

    private static boolean isValidMove(String move) {
        return move.equalsIgnoreCase("Rock") || move.equalsIgnoreCase("Paper") || move.equalsIgnoreCase("Scissors");
    }

    private static String getRandomMove(String[] moves) {
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }

    private static String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "It's a tie!";
        } else if (
                (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                        (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                        (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))
        ) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }
}