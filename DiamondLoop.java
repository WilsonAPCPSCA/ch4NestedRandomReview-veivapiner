/* Veiva Piner
 * 10/18/17
 * Period 1
 * Diamond code: Prints a diamond using a user inputed side length and *
 */
import java.util.Scanner;
public class DiamondLoop {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.print("This program is meant to print a diamond shape using *.\nPlease enter the side length for the diamond.");
	int length = in.nextInt();
	int count = 1;
	int numOfStars=1;
	for (int i=0; i<length; i++){
	for (int k=0; k<(length-count); k++){
	System.out.print(" ");
	}
	count++;
	for (int j=0; j<numOfStars; j++){
		System.out.print("*");
	}
	numOfStars = numOfStars+2;
	System.out.print("\n");
	}
	count = 1;
	numOfStars=numOfStars-2;
	for (int i=0; i<length; i++){
		for (int k=0; k<count; k++){
			System.out.print(" ");
		}
		count++;
		numOfStars=numOfStars-2;
		for (int j=0; j<numOfStars; j++){
			System.out.print("*");
		}
		System.out.print("\n");
	}
	}
}