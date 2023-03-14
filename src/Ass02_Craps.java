import java.util.Scanner; //imports class, allows user to input into program

public class Ass02_Craps { //declares new class called Ass02_Craps
    public static void main(String[] args) { //declares main method. String array as input
        Scanner input = new Scanner(System.in);
        System.out.println("It's time to D-d-d-d-DUEL!(playing craps)");//this is a yu gi oh reference. It is the intro music for season 1 of yu gi oh. Prints

        // loop until the player decides to stop
        do {


            int roll1 = rollDice();
            int roll2 = rollDice();
            int total = roll2+roll1;
            //calls rolldice twice to simulate rolling two dice. Result stored in roll1 and 2. Total is total.

            // displays the roll and total to the user
            System.out.printf("You rolled %d + %d = %d\n", roll1, roll2, total); //prints you rolled

            // determines if the user won or lost on the first roll
            if (total == 7 || total == 11) {
                System.out.println("Winner winner chicken dinner!");
            } else if (total == 2 || total == 3 || total == 12) {
                System.out.println("Loser!");
            } else { // sets the point value and enters point phase
                int point = total;
                System.out.printf("The amount of points you have is %d\n", point);

                // loops until the user either wins or loses
                while (true) {
                    // rolls two dice and calculates the total
                    roll1=rollDice();
                    roll2=rollDice();
                    total=roll1 + roll2;
                    // displays the roll and total to the user
                    System.out.printf("You done rolled %d + %d = %d\n", roll1, roll2, total); //this line states you rolled x + y = z when X is the value of roll 1 and Y is the value of roll 2. Z is obviously the total

                    // checks if the user won or lost during the point phase
                    if (total == point) {
                        System.out.println("I knew you'd win, always believe in the heart of the cards");
                        break; // exits the point phase loop
                    } else if (total == 7) {
                        System.out.println("Exodia OBLITERATE!!!!!!!"); //this is a yugioh reference. Yugi won the duel by using Exodia.
                        break; // exits the point phase loop
                    }
                }
            }
            //These lines determine if the user won or lost on the first roll. If the point total is 1,4,5,6,8,9, or 10 the game enters the point phase and the user keeps rolling until tbey win or lose.

            // prompts the user to play again or quit
            System.out.println("Do you want to play again? You will probably lose, just like Vegeta (y/n)");//Vegeta is the prince of all saiyans. He loses to Goku a significant amount. In this instance, the user is Vegeta and the computer is Goku
        } while (input.next().equals("y"));

        System.out.println("Sucks to suck!");
    }

    // method for rolling a single die
    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
