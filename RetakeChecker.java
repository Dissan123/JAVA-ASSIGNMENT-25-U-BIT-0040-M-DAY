/*
  PSEUDOCODE:
  1. Start
  2. Create a Scanner to read keyboard input
  3. Ask the user for three test scores
  4. Read score1, score2, score3 as doubles
  5. Calculate average = (score1 + score2 + score3) / 3
  6. Store in boolean needsRetake the result of (average < 50)
  7. Display the average
  8. Display the value of needsRetake
  9. End
 */

import java.util.Scanner;

public class RetakeChecker{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  score1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score3: ");
        double score3 = input.nextDouble();

        double average = (score1 + score2 + score3)/3;

        boolean needsRetake = average < 50;

        System.out.println("Average score: " + average);
        System.out.println("NeedsRetake: " + needsRetake);

        input.close();


    }
}


