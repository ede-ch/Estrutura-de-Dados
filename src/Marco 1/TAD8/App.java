package TAD8;

import java.util.Arrays;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        int tamanho = 1000;
        int[] elementos = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            elementos[i] = random.nextInt(1000); // Números aleatórios entre 0 e 999
        }

        Arrays.sort(elementos); // Ordena o vetor em ordem crescente

        Vetor vetor = new Vetor(elementos);

        int valorPesquisado = elementos[tamanho - 1]; // Último elemento do vetor

        long inicio, fim, tempo;

        // Pesquisa binária com loop de repetição
        inicio = System.nanoTime();
        int indiceLoop = vetor.pesquisaBinariaLoop(valorPesquisado);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Pesquisa binária com loop de repetição:");
        System.out.println("Índice do valor pesquisado: " + indiceLoop);
        System.out.println("Tempo: " + tempo + " nanosegundos");

        // Pesquisa binária com recursão
        inicio = System.nanoTime();
        int indiceRecursao = vetor.pesquisaBinariaRecursao(valorPesquisado);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("\nPesquisa binária com recursão:");
        System.out.println("Índice do valor pesquisado: " + indiceRecursao);
        System.out.println("Tempo: " + tempo + " nanosegundos");
    }
}
    
