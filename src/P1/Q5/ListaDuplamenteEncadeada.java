package P1.Q5;

public class ListaDuplamenteEncadeada {
    private No cabeca;
    private int tamanho;

    public void adicionar(int dado) {
        No novoNo = new No(dado);

        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;

            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = novoNo;
            novoNo.anterior = atual;
        }

        tamanho++;
    }

    public int nroPares() {
        int contador = 0;

        No atual = cabeca;

        while (atual != null) {
            if (atual.dado % 2 == 0) {
                contador++;
            }

            atual = atual.proximo;
        }

        return contador;
    }
}
