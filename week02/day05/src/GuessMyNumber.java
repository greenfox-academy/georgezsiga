import java.util.Scanner;

/**
 * Created by georgezsiga on 3/24/17.
 */
public class GuessMyNumber {
  public static void main(String[] arg) {

    System.out.println("Hi, lets play a guessing game.. What should be the range I can think of? Maybe: 0  100?");
    Scanner range = new Scanner(System.in);
    int min = range.nextInt();
    int max = range.nextInt();
    int myNumber = (int) (Math.random() * max + min);

    System.out.println("Nice! How many lives do you want to have?");
    Scanner scannerLife = new Scanner(System.in);
    int life = scannerLife.nextInt();
    System.out.println("Good! I got a number between " + min + " and " + max + ". Can you guess what it is? You have " + life + " lives have to guess it.");

    while (life > 0) {
      Scanner scanner = new Scanner(System.in);
      int userInput = scanner.nextInt();

      if (userInput == myNumber) {
        System.out.println("Congratulations! You won the game! You have " + life + " lives left.");
        System.exit(0);
      } else {
        if (userInput > myNumber) {
          life = life - 1;
          if (life == 0) {
            System.out.println("Game over! Sorry, you have no more lives left.");
            System.exit(0);
          } else {
            System.out.println("Too high. You have " + life + " lives left. Try again!");
          }
        } else {
          if (userInput < myNumber) {
            life = life - 1;
            if (life == 0) {
              System.out.println("Game over! Sorry, you have no more lives left.");
              System.exit(0);
            } else {
              System.out.println("Too low. You have " + life + " lives left. Try again!");
            }
          }
        }
      }
    }
  }
}
//  Write a program where the program chooses a number between 1 and 100.
// The player is then asked to enter a guess. If the player guesses wrong,
// then the program gives feedback and ask to enter an other guess until the guess is correct.
//
//        Make the range customizable (ask for it before starting the guessing).
//        You can add lives. (optional)
//        Example
//
//        I've the number between 1-100. You have 5 lives.
//
//        20
//        Too high. You have 4 lives left.
//
//        10
//        Too low. You have 3 lives left.
//
//        15
//        Congratulations. You won!