package TAD7;

import java.util.Random;

public class Vetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
        }
    }

    public int encontrarMaiorRecursivo() {
        return encontrarMaiorRecursivo(0, elementos.length - 1);
    }

    private int encontrarMaiorRecursivo(int inicio, int fim) {
        if (inicio == fim) {
            return elementos[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            int maiorEsquerda = encontrarMaiorRecursivo(inicio, meio);
            int maiorDireita = encontrarMaiorRecursivo(meio + 1, fim);
            return Math.max(maiorEsquerda, maiorDireita);
        }
    }

    public int encontrarMaiorIterativo() {
        int maior = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }

}
