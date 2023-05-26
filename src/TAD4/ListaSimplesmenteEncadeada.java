package TAD4;

public class ListaSimplesmenteEncadeada<T> {

    private No<T> primeiro;
    private No<T> ultimo;

    public ListaSimplesmenteEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void inserir(T dado) {
        No<T> novoNo = new No<>(dado);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
    }

    public void imprimir() {
        No<T> atual = primeiro;

        while (atual != null) {
            System.out.println(atual.getDado());
            atual = atual.getProximo();
        }
    }
}
