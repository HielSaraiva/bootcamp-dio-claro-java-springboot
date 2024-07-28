package app;

import java.util.Scanner;

import exception.InvalidParametersException;

public class Counter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insert first parameter");
		int firstParameter = input.nextInt();

		System.out.println("Insert second parameter");
		int secondParameter = input.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			count(firstParameter, secondParameter);

		} catch (InvalidParametersException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage());
		}

	}

	static void count(int firstParameter, int secondParameter) {
		// validar se firstParameter é MAIOR que secondParameter e lançar a exceção
		if (firstParameter >= secondParameter) {
			throw new InvalidParametersException("Second parameter CANNOT BE bigger than first parameter");
		} else {
			int score = secondParameter - firstParameter;

			for (int i = 1; i <= score; i++) {
				System.out.println("Printing number " + i);
			}
		}
	}
}