import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    private int tamanhoMaximo;
    private int topo;
    private char[] elementos;

    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.topo = -1;
        this.elementos = new char[tamanhoMaximo];
    }

    public void empilha(char elemento) {
        if (topo == tamanhoMaximo - 1) {
            throw new PilhaCheiaException("A pilha está cheia.");
        }
        elementos[++topo] = elemento;
    }

    public char desempilha() {
        if (vazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        }
        return elementos[topo--];
    }

    public int tamanho() {
        return topo + 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public char topo() {
        if (vazia()) {
            throw new PilhaVaziaException("A pilha está vazia.");
        }
        return elementos[topo];
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Pilha vazia.");
            return;
        }
        System.out.print("Pilha: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}