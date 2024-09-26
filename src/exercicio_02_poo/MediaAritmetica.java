package exercicio_02_poo;

import java.util.Scanner;

public class MediaAritmetica {

    // Método que calcula a média aritmética de três números
    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Método principal para capturar a entrada do usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double num3 = scanner.nextDouble();

        // Chama o método para calcular a média e exibe o resultado
        double media = calcularMedia(num1, num2, num3);
        System.out.println("A média aritmética dos três números é: " + media);

        scanner.close();
    }
}
