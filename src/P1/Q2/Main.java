package P1.Q2;

public class Main {

    /*
     * O método Selection Sort, abaixo, sofreu um pequeno ajuste: passou a trabalhar
     * com a seleção do maior valor, colocando-o na última posição; do segundo maior
     * valor colocando-o na penúltima posição e, assim, sucessivamente. Complete-o!
     */

    public void selectionSort() {
        for (int i = tamanho - 1; i >= 0; i--) {
            int maior = this.posMaior(i);
            if (maior != i)
                this.troca(i, maior);
        }
    }

    /* Métodos auxiliares: */
    private int posMaior(int fim) {
        int maior = fim;
        for (int i = fim - 1; i >= 0; i--)
            if (valor[i] > valor[maior])
                maior = i;
        return maior;
    }

    private void troca(int a, int b) {
        float aux;
        aux = valor[a];
        valor[a] = valor[b];
        valor[b] = aux;
    }

}
