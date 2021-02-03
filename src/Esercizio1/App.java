package Esercizio1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// run(scanner);

		String resp = "S";

		do {

			run(scanner);
			System.out.println("Vuoi fare un'altra operazione?");
			scanner.nextLine();
			resp = scanner.nextLine();

		} while (!resp.equals("N"));

		scanner.close();

	}

	public static void run(Scanner scanner) {

		System.out.println("Insertisci due numeri");

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println(num1 + num2);

	}

}
