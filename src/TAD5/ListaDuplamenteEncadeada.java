package TAD5;

public class ListaDuplamenteEncadeada {

    private No primeiro;
    private No ultimo;

    public ListaDuplamenteEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.setAnterior(ultimo);
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
    }

    public void imprimirSentidoDireto() {
        No atual = primeiro;

        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }

        System.out.println();
    }

    public void imprimirSentidoReverso() {
        No atual = ultimo;

        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getAnterior();
        }

        System.out.println();
    }

    public boolean buscar(int valor) {
        No atual = primeiro;

        while (atual != null) {
            if (atual.getValor() == valor) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }

    public void remover(int valor) {
        No atual = primeiro;

        while (atual != null) {
            if (atual.getValor() == valor) {
                if (atual == primeiro) {
                    primeiro = atual.getProximo();
                    if (primeiro != null) {
                        primeiro.setAnterior(null);
                    }
                } else if (atual == ultimo) {
                    ultimo = atual.getAnterior();
                    if (ultimo != null) {
                        ultimo.setProximo(null);
                    }
                } else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                }
                break;
            }
            atual = atual.getProximo();
        }
    }
}
    
