/* Veiva Piner
 * 10/18/17
 * Period 1
 * Coin Flip code: prints H and T for the number of coin flips
 * and counts the number of times heads occurs and the number of times tails occurs
 */
import java.util.Scanner;
import java.util.Random;
public class CoinFlipLoop {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	Random rand = new Random();
	System.out.println("This program will simulate the flipping of a fair coin.\nHow many times would you like the coin to be flipped?");
	int numOfFlips = in.nextInt();
	int count = 0;
	int headCount = 0;
	int tailCount = 0;
	System.out.println("Here is the sequence of flips: ");
	do{
		int flip = rand.nextInt(2)+1;
		if (flip==1){
			System.out.print("H"+" ");
			headCount++;
		} else {
			System.out.print("T"+" ");
			tailCount++;
		}
		count++;
	} while (count<numOfFlips);
	System.out.println("\nThere were "+headCount+" heads and "+tailCount+" tails");

	}

}
