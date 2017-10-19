/* Veiva Piner
 * 10/18/17
 * Period 1
 * Dice sum code: Prints the number of times the sum of two dice occurs using * for each time
 */
import java.util.Scanner;
import java.util.Random;
public class DiceSumLoop {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	Random rand = new Random();
	System.out.println("This program will simulate the rolling of a pair of dice.\nHow many times would you like the dice to be tossed?");
	int count = 0;
	int twoCount = 0;
	int threeCount = 0;
	int fourCount = 0;
	int fiveCount = 0;
	int sixCount = 0;
	int sevenCount = 0;
	int eightCount = 0;
	int nineCount = 0;
	int tenCount = 0;
	int elevenCount = 0;
	int twelveCount = 0;
	int rolls = in.nextInt();
	System.out.print("Here is the sequence of sums for each toss:\n");
	do{
		int dieOne = rand.nextInt(6)+1;
		int dieTwo = rand.nextInt(6)+1;
		int sum = dieOne+dieTwo;
		count++;
		System.out.print(sum+" ");
		if (sum==2){
			twoCount++;
		} else if (sum==3){
			threeCount++;
		} else if (sum==4){
			fourCount++;
		} else if (sum==5){
			fiveCount++;
		} else if (sum==6){
			sixCount++;
		} else if (sum==7){
			sevenCount++;
		} else if (sum==8){
			eightCount++;
		} else if (sum==9){
			nineCount++;
		} else if (sum==10){
			tenCount++;
		} else if (sum==11){
			elevenCount++;
		} else{
			twelveCount++;
		}
	} while(count<rolls);
	System.out.print("\n");
	System.out.print("2: ");
	for (int i=0; i<twoCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("3: ");
	for (int i=0; i<threeCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("4: ");
	for (int i=0; i<fourCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("5: ");
	for (int i=0; i<fiveCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("6: ");
	for (int i=0; i<sixCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("7: ");
	for (int i=0; i<sevenCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("8: ");
	for (int i=0; i<eightCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("9: ");
	for (int i=0; i<nineCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("10: ");
	for (int i=0; i<tenCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("11: ");
	for (int i=0; i<elevenCount; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	System.out.print("12: ");
	for (int i=0; i<twelveCount; i++){
		System.out.print("*");
	}

	}

}
