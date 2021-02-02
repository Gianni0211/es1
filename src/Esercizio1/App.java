package Esercizio1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		App.run();
		System.out.println("Vuoi fare un'altra operazione?");
		
		String resp = scanner.nextLine();

		if (resp.equals("N")) {
			System.exit(2);
		} else if (resp.equals("Y")) {
			App.run();
		}

	}

	public static void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insertisci due numeri");

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println(num1 + num2);
	}
}
