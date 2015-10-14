package hashmapPackage;

import java.util.Scanner;

public class UsingHashmapsProg {

	public static void main(String[] args) {

		IntValueHashmap newMap = new IntValueHashmap();

		Scanner sc = new Scanner(System.in);
		int key;
		String value, quit = "";
		System.out.println("To quit enter 'n'.\n");

		
		while (!quit.equals("n")) {
			key = Validator.getInt(sc, "Enter a number: " );
			if (!newMap.getMyMap(key)) {
				System.out.println("The number you entered was not found.");
				value = Validator.getString(sc, "Please enter the word value of this number: ");
				value = Character.toUpperCase(value.charAt(0))
						+ value.substring(1);
				newMap.setMyMap(key, value);
				newMap.getMyMap(key);
			}
			System.out.print("Continue? ");
			quit = sc.next().toLowerCase();
			System.out.println("\n");
			
		}

		newMap.writeNumberValue();
		System.out.println("Program Ends.");
		sc.close();

	}

}
