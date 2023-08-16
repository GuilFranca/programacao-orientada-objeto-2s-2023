package exercicio1.java;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();

		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextDouble();

		System.out.println("Escolha a operação (+, -, *, /): ");
		char operation = scanner.next().charAt(0);

		double result = 0.0;

		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Não é possível dividir por zero.");
				return;
			}
			break;
		default:
			System.out.println("Operação inválida.");
			return;

		}
		System.out.println("Resultado: " + result);
	}

}
