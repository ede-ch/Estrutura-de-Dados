public class ABB {

    private No raiz;

    public No busca(int chave) {
        return buscaRecursiva(raiz, chave);
    }

    private No buscaRecursiva(No atual, int chave) {
        if (atual == null || atual.chave == chave) {
            return atual;
        }
        if (chave < atual.chave) {
            return buscaRecursiva(atual.esq, chave);
        }
        return buscaRecursiva(atual.dir, chave);
    }

    public void imprimePreOrdem() {
        imprimePreOrdem(raiz);
    }

    private void imprimePreOrdem(No atual) {
        if (atual != null) {
            System.out.print(atual.chave + " ");
            imprimePreOrdem(atual.esq);
            imprimePreOrdem(atual.dir);
        }
    }

    public void remove(int chave) {
        raiz = remove(raiz, chave);
    }

    private No remove(No atual, int chave) {

        if (atual == null) {
            return null;
        }

        if (chave < atual.chave) {
            atual.esq = remove(atual.esq, chave);
        } else if (chave > atual.chave) {
            atual.dir = remove(atual.dir, chave);
        } else {

            if (atual.esq == null) {
                return atual.dir;
            } else if (atual.dir == null) {
                return atual.esq;
            }

            No menor = encontrarMenor(atual.dir);
            atual.chave = menor.chave;
            atual.dir = remove(atual.dir, menor.chave);
        }

        return atual;
    }

    private No encontrarMenor(No atual) {
        if (atual.esq != null) {
            return encontrarMenor(atual.esq);
        }
        return atual;
    }

}