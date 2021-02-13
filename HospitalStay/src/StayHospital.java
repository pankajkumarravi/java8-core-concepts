import java.util.Scanner;

/*
 * This challenge computes and displays the total charges for a hospital stay
 * The patient might be admitted overnight.  For an overnight stay, we need: 
 *   The number of days spent in the hospital
 *   The daily rate
 *   Medication charges
 *   Lab service charges
 */
public class StayHospital {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double hospitalChgarges;
		String resonse;
		do {
			if (isOverNightStay() == true) {
				System.out.println("Enter the cost of Hospital : ");
				Scanner scanner = new Scanner(System.in);
				hospitalChgarges = scanner.nextDouble();
			} else {
				hospitalChgarges = 0;
			}
			System.out.println("Total costs =  " + totalCostCalculate(hospitalChgarges));
			System.out.println("Do you have another Patient ?? ((Y/N)");
		
		 resonse=scanner.next();
		} while (resonse.equalsIgnoreCase("y"));
	}

	public static boolean isOverNightStay() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is this an Overnight stay ?? say (Y/N)");
		String isOveerNightStay = scanner.next();
		if (isOveerNightStay.equalsIgnoreCase("y"))
			return true;
		else
			return false;
	}

	public static double totalCostCalculate(double hospitalChgarges) {
		double medicationCharges, labService, totalcharges;
		System.out.println("Enter Medication charges :");
		medicationCharges = scanner.nextDouble();
		System.out.println("please enter lab srvice charges :");
		labService = scanner.nextDouble();
		totalcharges = hospitalChgarges + medicationCharges + labService;
		return totalcharges;
	}
}
