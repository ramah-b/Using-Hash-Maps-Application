package hashmapPackage;

import java.util.Scanner;

public class UsingHashmapsProg {

	public static void main(String[] args) {

		IntValueHashmap newMap = new IntValueHashmap();

		Scanner sc = new Scanner(System.in);
		int key;
		String value, quit = "";
		System.out.println("To quit enter 'n'.");

		
		while (!quit.equals("n")) {
			System.out.print("Enter a number: ");
			key = sc.nextInt();
			if (!newMap.getMyMap(key)) {
				System.out.println("The number you entered was not found.");
				System.out
						.println("Please enter the word value of this number: ");
				value = sc.next();
				value = Character.toUpperCase(value.charAt(0))
						+ value.substring(1);
				newMap.setMyMap(key, value);
				newMap.getMyMap(key);
			}
			System.out.print("Continue? ");
			quit = sc.next().toLowerCase();
			
		}

		System.out.println("Program Ends.");
		sc.close();

	}

}
