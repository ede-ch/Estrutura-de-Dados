package TAD8;

import java.util.Arrays;
import java.util.Random;

public class Vetor {
    private int[] elementos;

    public Vetor(int[] elementos) {
        this.elementos = elementos;
    }

    public int pesquisaBinariaLoop(int valor) {
        int esquerda = 0;
        int direita = elementos.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (elementos[meio] == valor) {
                return meio;
            } else if (elementos[meio] < valor) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }

    public int pesquisaBinariaRecursao(int valor) {
        return pesquisaBinariaRecursao(valor, 0, elementos.length - 1);
    }

    private int pesquisaBinariaRecursao(int valor, int esquerda, int direita) {
        if (esquerda > direita) {
            return -1;
        }

        int meio = (esquerda + direita) / 2;

        if (elementos[meio] == valor) {
            return meio;
        } else if (elementos[meio] < valor) {
            return pesquisaBinariaRecursao(valor, meio + 1, direita);
        } else {
            return pesquisaBinariaRecursao(valor, esquerda, meio - 1);
        }
    }

}

