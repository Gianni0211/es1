package Esercizio1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insertisci due numeri");

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println(num1 + num2);
		System.out.println("Vuoi fare un'altra operazione?");
		scanner.nextLine();
		String resp = scanner.nextLine();
		System.out.println(resp);

		if (resp == "N") {
			System.exit(2);
		}

	}
}
