
public class FilaVetor2 {

        private Object[] elementos;
        private int inicio;
        private int fim;
        private int tamanho;

        public FilaVetor2(int capacidade) {
            this.elementos = new Object[capacidade];
            this.inicio = 0;
            this.fim = 0;
            this.tamanho = 0;
        }

        public boolean adiciona(Object elemento) {
            if (this.tamanho == this.elementos.length) {
                return false;
            }

            this.elementos[fim] = elemento;
            fim = (fim + 1) % this.elementos.length;
            this.tamanho++;
            return true;
        }

        public Object remove() {
            if (this.tamanho == 0) {
                return null;
            }

            Object elemento = this.elementos[inicio];
            inicio = (inicio + 1) % this.elementos.length;
            this.tamanho--;
            return elemento;
        }

        public int size() {
            return this.tamanho;
        }

        public boolean isEmpty() {
            return this.tamanho == 0;
        }

        public void imprime() {
            if (this.tamanho == 0) {
                System.out.println("Fila vazia");
                return;
            }

            for (int i = inicio; i < inicio + tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }

    }

