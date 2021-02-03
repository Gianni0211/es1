package Esercizio1;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una frase");
		String input = scanner.nextLine();
		int endIndex = input.indexOf(" ");
		String output = input.substring(0, endIndex);
		System.out.println(output);
		scanner.close();

	}
}
