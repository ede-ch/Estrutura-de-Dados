
public class Fila {
    private No inicio;
    private No fim;
    private int tamanho;

    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void enfileira(char elemento) {
        No novoNo = new No(elemento);
        if (vazia()) {
            inicio = novoNo;
        } else {
            fim.setProximo(novoNo);
        }
        fim = novoNo;
        tamanho++;
    }

    public char desenfileira() {
        if (vazia()) {
            throw new FilaVaziaException("A fila está vazia.");
        }
        char elemento = inicio.getElemento();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return elemento;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean vazia() {
        return tamanho == 0;
    }
}