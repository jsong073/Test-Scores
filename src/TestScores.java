/*
This program should get 10 test scores from a user, save them into an array, and find the highest, lowest, and average
1. Set up variables
    a. an int array with 10 spaces
    b. an int for highest score
    c. an int for lowest score
    d. a double for average score
    e. A Scanner to receive input from users
    f. an int for sum
2. Set up a for loop to assign values to the array
    a. for (int i = 0; i < array length; i++)
    b. Each iteration should ask for a score from the user
    c. The number received from the user should be assigned to array[i]
3. Set up a for loop to find highest score
    a. for (int i = 0; i < array length; i ++)
    b. the highest score int should be initialized as 0
    c. Each iteration, compare the array[i] value with the highest score int (highScore) using an if statement
        i. if the array[i] value is higher than the highScore value, replace the highScore value with array[i]
        ii. if not, ignore and continue
    d. At the end of the loop, the highScore should be the greatest value in the array
4. Set up a for loop to find the lowest score
    a. Same as step 3, but instead of checking if array[i] is greater than the lowest score int (lowScore),
        check if array[i] is lower than lowScore
    b. lowScore can be initialized as an arbitrarily high number i.e. 999999, so that the first score encountered in
        the loop is automatically the lowest
5. Find the average score
    a. Set up a for loop with the same loop parameters as steps 3 and 4
    b. Each iteration, add the array[i] value to sum. This should get us the total value
    c. To get the average score, divide the sum by array.length
6. Print out results
 */

import java.util.Arrays;
import java.util.Scanner;

public class TestScores {
    public static void main (String[] args) {
        int[] scores = new int[10];
        int highScore = 0;
        int lowScore = 99999;
        int sum = 0;
        double averageScore = 0.0;
        Scanner sc = new Scanner(System.in);

        //This loop should assign scores the the scores[] array
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter a score (" + (i + 1) +"/10): ");
            scores[i] = sc.nextInt();
        }

        //This loop should find the highest score
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }

        //This loop should find the lowest score
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowScore) {
                lowScore = scores[i];
            }
        }

        //This loop should find the sum, which is used to calculate the average score
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        averageScore = (double)sum/scores.length;

        //print out results
        System.out.println("The highest score is: " + highScore);
        System.out.println("The lowest score is: " + lowScore);
        System.out.println("The average score is: " + averageScore);
        System.out.println("All the scores are: " + Arrays.toString(scores));
    }
}
