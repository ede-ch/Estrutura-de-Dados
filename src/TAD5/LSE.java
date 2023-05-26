package TAD5;

public class LSE<T> {

    private No<T> primeiro;

    private static class No<T> {
        T elemento;
        No<T> proximo;

        public No(T elemento, No<T> proximo) {
            this.elemento = elemento;
            this.proximo = proximo;
        }
    }

    public void inserir(T elemento) {
        No<T> novoNo = new No<>(elemento, null);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void imprimir() {
        No<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }
}
