import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {

        // Declaração do vetor de inteiros com 3 posições
        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores inseridos pelo usuário
        System.out.println("Insira 3 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibe os valores inseridos
        System.out.println("Valores inseridos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Calcula a média dos valores
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        double media = (double) soma / numeros.length;


        System.out.println("\nA média dos valores é: " + media);
    }
}