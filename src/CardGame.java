import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read in the number of cards for each player
        int andreaCount = input.nextInt();
        int mariaCount = input.nextInt();




        // Read in the cards for each player
        int[] andrea = new int[andreaCount];
        int[] maria = new int[mariaCount];
        for (int i = 0; i < andreaCount; i++) {
            andrea[i] = input.nextInt();
        }
        for (int i = 0; i < mariaCount; i++) {
            maria[i] = input.nextInt();
        }

        // Read in the value of s
        String s = input.next();

        // Determine the winner of the game
        int andreaScore = 0;
        int mariaScore = 0;
        for (int i = 0; i < andreaCount; i++) {
            // Only consider cards at even or odd indices, depending on the value of s
            if ((i % 2 == 0 && s.equals("Even")) || (i % 2 == 1 && s.equals("Odd"))) {
                andreaScore += andrea[i] - maria[i];
                mariaScore += maria[i] - andrea[i];
            }
        }

        // Print the winner
        if (andreaScore > mariaScore) {
            System.out.println("Andrea");
        } else if (mariaScore > andreaScore) {
            System.out.println("Maria");
        } else {
            System.out.println("Tie");
        }

        input.close();
    }
}
