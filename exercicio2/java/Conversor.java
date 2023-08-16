package exercicio2.java;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int choice = scanner.nextInt();

        double result = 0.0;

        if (choice == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            result = celsiusToFahrenheit(celsius);
            System.out.println("A temperatura em Fahrenheit é: " + result);
        } else if (choice == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            result = fahrenheitToCelsius(fahrenheit);
            System.out.println("A temperatura em Celsius é: " + result);
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}