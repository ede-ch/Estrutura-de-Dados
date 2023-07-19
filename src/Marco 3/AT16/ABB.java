public class ABB {

    private No raiz;

    public boolean estaVazia() {
        return raiz == null;
    }

    public void inserir(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
        } else {
            inserirRecursivo(raiz, valor);
        }
    }

    private void inserirRecursivo(No atual, int valor) {
        if (valor < atual.valor) {
            if (atual.esq == null) {
                atual.esq = new No(valor);
            } else {
                inserirRecursivo(atual.esq, valor);
            }
        } else {
            // inserção à direita
        }
    }

    public void buscar(int valor) {
        No atual = raiz;
        while (atual != null) {
            if (valor < atual.valor) {
                atual = atual.esq;
            } else if (valor > atual.valor) {
                atual = atual.dir;
            } else {
                System.out.println("Valor encontrado!");
                return;
            }
        }
        System.out.println("Valor não encontrado!");
    }

    public void imprimir() {
        // percorrer a árvore em ordem
    }

}