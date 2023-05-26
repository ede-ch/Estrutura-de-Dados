package TAD9;

import java.util.Arrays;
import java.util.Random;

public class Vetor {
    private int[] elementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
    }

    public void preencherAleatorio() {
        Random random = new Random();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = random.nextInt(1000);
        }
    }

    public void exibir() {
        System.out.println(Arrays.toString(elementos));
    }

    public void bubbleSort() {
        int n = elementos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        int n = elementos.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (elementos[j] < elementos[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = elementos[minIndex];
            elementos[minIndex] = elementos[i];
            elementos[i] = temp;
        }
    }

    public void insertionSort() {
        int n = elementos.length;
        for (int i = 1; i < n; i++) {
            int key = elementos[i];
            int j = i - 1;
            while (j >= 0 && elementos[j] > key) {
                elementos[j + 1] = elementos[j];
                j--;
            }
            elementos[j + 1] = key;
        }
    }
}
