import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        // Declaração do vetor de strings com 3 posições
        String[] nomes = new String[3];
        Scanner scanner = new Scanner(System.in);

        // Leitura dos nomes inseridos pelo usuário
        System.out.println("Insira 3 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Exibe os nomes inseridos
        System.out.println("\nNomes inseridos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}