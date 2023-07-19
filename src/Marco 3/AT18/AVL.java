public class AVL {

    private No raiz;

    public void inserir(int valor) {
        this.raiz = inserir(this.raiz, valor);
    }

    private No inserir(No no, int valor) {

        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esq = inserir(no.esq, valor);
        } else {
            no.dir = inserir(no.dir, valor);
        }

        atualizarAltura(no);

        return balancear(no);

    }

    private void atualizarAltura(No no) {
        int altEsq = (no.esq == null) ? 0 : no.esq.altura;
        int altDir = (no.dir == null) ? 0 : no.dir.altura;
        no.altura = Math.max(altEsq, altDir) + 1;
    }

    private No balancear(No no) {
        int fatorBalanceamento = obterFatorBalanceamento(no);

        if (fatorBalanceamento > 1) {
            if (obterFatorBalanceamento(no.dir) < 0) {
                no.dir = rotacaoDireita(no.dir);
            }
            return rotacaoEsquerda(no);
        } else if (fatorBalanceamento < -1) {
            if (obterFatorBalanceamento(no.esq) > 0) {
                no.esq = rotacaoEsquerda(no.esq);
            }
            return rotacaoDireita(no);
        }

        return no;
    }

    // Rotacao para esquerda
    private No rotacaoEsquerda(No no) {
        No aux = no.dir;
        no.dir = aux.esq;
        aux.esq = no;
        atualizarAltura(no);
        atualizarAltura(aux);
        return aux;
    }

    // Rotacao para direita
    private No rotacaoDireita(No no) {
        No aux = no.esq;
        no.esq = aux.dir;
        aux.dir = no;
        atualizarAltura(no);
        atualizarAltura(aux);
        return aux;
    }

    // Obtem fator de balanceamento
    private int obterFatorBalanceamento(No no) {
        int altEsq = (no.esq == null) ? 0 : no.esq.altura;
        int altDir = (no.dir == null) ? 0 : no.dir.altura;
        return altEsq - altDir;
    }

}