package exercicio_02_poo;

import java.util.Scanner;

public class VerificadorNumero {

    // Método que verifica se o número é positivo ou negativo
    public static String verificarNumero(int numero) {
        if (numero >= 0) {
            return "O número " + numero + " é positivo.";
        } else {
            return "O número " + numero + " é negativo.";
        }
    }

    // Método principal para capturar a entrada do usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        // Chama o método para verificar o número e exibe o resultado
        String resultado = verificarNumero(numero);
        System.out.println(resultado);

        scanner.close();
    }
}
