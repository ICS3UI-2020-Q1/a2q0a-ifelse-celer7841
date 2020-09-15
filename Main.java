import java.util.Scanner;

/**
 * This program will determine wheteher they can drive and/or vote
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a Scanner or user input.
    Scanner input = new Scanner(System .in);

    // constant for the legal driving age
    final int DRIVING_AGE = 16;
    // constant for the legal voting age 
    final int VOTING_AGE = 18;

    // Get the user's age
    System.out.println("Please enter your age:");
    int age = input.nextInt();

    // check to see if they are old enough to drive and vote
    if (age >= VOTING_AGE) {
      System.out.println("You are old enough to drive!");
      System.out.println("You are old enough to vote!");
    } else if ( age >= DRIVING_AGE){ 
      System.out.println("You are old enough to drive");
      System.out.println("You are not old enough to vote");
     } else {
      System.out.println("Sorry, you are not old enough to drive!");
      System.out.println("You also can't vote... :(");
    }
    
  }
}
