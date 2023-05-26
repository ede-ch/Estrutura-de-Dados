package TAD4;

public class LSE {

    private Noh primeiro;
    private Noh ultimo;
    private int totalDeElementos;

    public void adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Noh novo = new Noh(elemento, null);
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
            this.totalDeElementos++;
        }
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object elemento) {
        Noh atual = this.primeiro;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public Object pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {
    }

    public void adiciona(int posicao, Object elemento) {
    }

    public void adicionaNoComeco(Object elemento) {
        Noh novo = new Noh(elemento, this.primeiro);
        this.primeiro = novo;
        if (this.totalDeElementos == 0) {
            this.ultimo = this.primeiro;
        }
        this.totalDeElementos++;
    }

    public void removeDoComeco() {
    }

    public void removeDoFim() {
    }

    public String imprime() {
        return null;
    }   
}
