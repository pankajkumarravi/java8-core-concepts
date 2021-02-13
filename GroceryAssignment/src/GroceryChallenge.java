import java.util.ArrayList;
import java.util.Scanner;

/*
 * This is the start of the challenge on beyond basics. 
 * This program creates a string arraylist and then adds 5 grocery items to 
 * the list.  Then, it prompts the user to enter another item, it searches the 
 * list, if it is not found, it adds it to the list, otherwise it displays
 * a message that the item is already in the list.
 */
public class GroceryChallenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> groceries = new ArrayList<String>();
		groceries.add("Banana");
		groceries.add("Caconu oil");
		groceries.add("Chilli Powder");
		groceries.add("milk 1 L");
		groceries.add("Soap");
		System.out.println("Curent Groceries items ar e: \n " + groceries.toString());
		System.out.println("Entyer another item or \"quit\" to exit");
		String newItem = scanner.nextLine();
		boolean found = false;
		while (newItem.equalsIgnoreCase("quit") == false) {
			for (int i = 0; i < groceries.size(); i++) {
				if (newItem.equalsIgnoreCase(groceries.get(i))) {
					System.out.println("Item is already in the List ");
					found = true;
				}
			}
			if (found == false) {
				groceries.add(newItem);
			}
			System.out.println("Enter another item or \"quit\" to exit");
			newItem=scanner.nextLine();
		}
		System.out.println("Final List " + groceries.toString());
	}
}
