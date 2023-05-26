package P1.Q9;

public class ListaEncadeada {

    public Node primeiro;
    public Node ultimo;
    public int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void inserir(int valor) {
        Node novo = new Node(valor);
        if (this.primeiro == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            this.ultimo.proximo = novo;
            novo.anterior = this.ultimo;
            this.ultimo = novo;
        }
        this.tamanho++;
    }

    public void inserir(int valor, int posicao) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        Node novo = new Node(valor);
        if (posicao == 0) {
            novo.proximo = this.primeiro;
            this.primeiro.anterior = novo;
            this.primeiro = novo;
        } else if (posicao == this.tamanho) {
            this.ultimo.proximo = novo;
            novo.anterior = this.ultimo;
            this.ultimo = novo;
        } else {
            Node aux = this.primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.proximo;
            }
            novo.proximo = aux.proximo;
            novo.anterior = aux;
            aux.proximo.anterior = novo;
            aux.proximo = novo;
        }
        this.tamanho++;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if (posicao == 0) {
            this.primeiro = this.primeiro.proximo;
            this.primeiro.anterior = null;
        } else if (posicao == this.tamanho - 1) {
            this.ultimo = this.ultimo.anterior;
            this.ultimo.proximo = null;
        } else {
            Node aux = this.primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.proximo;
            }
            aux.proximo = aux.proximo.proximo;
    }   }

    public void bubble_sort() {
        int aux;
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = 0; j < this.tamanho - 1; j++) {
                if (this.primeiro.valor > this.primeiro.proximo.valor) {
                    aux = this.primeiro.valor;
                    this.primeiro.valor = this.primeiro.proximo.valor;
                    this.primeiro.proximo.valor = aux;
                }
                this.primeiro = this.primeiro.proximo;
            }
            this.primeiro = this.primeiro.proximo;
        }
    }
}
