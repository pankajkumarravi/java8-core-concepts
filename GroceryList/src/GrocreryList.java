import java.util.Scanner;

public class GrocreryList {

	public static void main(String[] args) {
		double[] prices = new double[05];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 5 prices :");
		prices[0] = scanner.nextDouble();
		prices[1] = scanner.nextDouble();
		prices[2] = scanner.nextDouble();
		prices[3] = scanner.nextDouble();
		prices[4] = scanner.nextDouble();
		double totalPrice = prices[0] + prices[1] + prices[2] + prices[3] + prices[4];
		System.out.printf("The Total price for all 5 items is : Rs %5.2f" , totalPrice);
	}
}
