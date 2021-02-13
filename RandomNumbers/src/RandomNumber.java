import java.util.Random;

/*
 * This program demonstrates using a predefined method
 * It randomly generates two die values 100 times
 * and counts how many times we roll doubles
 */
public class RandomNumber {

	public static void main(String[] args) {
		int die1, die2, countDoubles = 0;
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			die1 = random.nextInt(6) + 1;
			die2 = random.nextInt(6) + 1;
			if (die1 == die2) {
				countDoubles++;
			}
		}
		System.out.println("I rolled "+countDoubles +" times");
	}
}
