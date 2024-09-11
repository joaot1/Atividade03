public class Atividade03 {
    public static void main(String[] args) {

        // Declaração e inicialização dos vetores
        int[] numero = {5, 10};

        // Exibe o vetor antes da troca
        System.out.println("Vetor antes da troca: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }

        // Troca dos vetores
        int temp = numero[0];
        numero[0] = numero[1];
        numero[1] = temp;

        // Exibe o vetor depois da troca
        System.out.println("Vetor depois da troca: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}
