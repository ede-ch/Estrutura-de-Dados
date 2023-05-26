package P1.Q6;

public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionarOrdenado(5);
        lista.adicionarOrdenado(2);
        lista.adicionarOrdenado(10);
        lista.adicionarOrdenado(7);
        
        // Exemplo de impressão dos elementos da lista
        No atual = lista.inicio;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}
    
