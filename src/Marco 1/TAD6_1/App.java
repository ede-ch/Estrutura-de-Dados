package TAD6_1;

public class App {
    /*
     * - Implemente um TAD LDE que armazena inteiros;
     * - Em seguida, refatore o método remove() de modo que a busca ocorra em outro
     * método e seu retorno seja utilizado no método remove();
     * - Implemente o método de impressão de modo que seja possível escrever os
     * inteiros em ambos os sentidos;
     */

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);

        System.out.println("Impressão no sentido direto:");
        lista.imprimirSentidoDireto();

        System.out.println("Impressão no sentido reverso:");
        lista.imprimirSentidoReverso();

        int valorBusca = 20;
        if (lista.buscar(valorBusca)) {
            System.out.println("Valor " + valorBusca + " encontrado na lista.");
        } else {
            System.out.println("Valor " + valorBusca + " não encontrado na lista.");
        }

        int valorRemocao = 30;
        lista.remover(valorRemocao);

        System.out.println("Lista após remoção do valor " + valorRemocao + ":");
        lista.imprimirSentidoDireto();
    }
}
