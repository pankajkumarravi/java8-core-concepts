import java.util.Scanner;

/*
 * This program asks the user for the heights of each student in class. 
 * Then finds the height of the tallest student, and the average height of all 
 * students.
 */
public class HeighReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Students do you have ??? ");
		int noOfStudents = scanner.nextInt();
		double sudentsHeights[];
		sudentsHeights = new double[noOfStudents];
		for (int i = 0; i < noOfStudents; i++) {
			System.out.println("Enter Heights :");
			sudentsHeights[i] = scanner.nextDouble();
		}
		// find tallest student
		double tallest = sudentsHeights[0];

		for (int i = 0; i < sudentsHeights.length; i++) {
			if (tallest < sudentsHeights[i])
				tallest = sudentsHeights[i];

		}
		// find avg height
		double totalHeight = 0.0;
		for (int i = 0; i < sudentsHeights.length; i++) {
			totalHeight += sudentsHeights[i];
		}
		System.out.println("tallest Student = "+tallest+" inches");
		System.out.println("Avg Height of all " + noOfStudents + " = " + (totalHeight/noOfStudents)+" inches");
		 
	}
}
