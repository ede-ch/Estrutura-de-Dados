package P1.Q6;

public class ListaDuplamenteEncadeada {

    No inicio;
    private No fim;
    
    public void adicionarOrdenado(int numero) {
        No novoNo = new No(numero);
        
        // Caso a lista esteja vazia
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
            return;
        }
        
        // Caso o número seja menor que o primeiro elemento da lista
        if (numero < inicio.valor) {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
            return;
        }
        
        // Caso o número seja maior que o último elemento da lista
        if (numero > fim.valor) {
            novoNo.anterior = fim;
            fim.proximo = novoNo;
            fim = novoNo;
            return;
        }
        
        // Inserir o número ordenadamente entre dois nós existentes
        No atual = inicio;
        while (atual != null && numero > atual.valor) {
            atual = atual.proximo;
        }
        
        No anterior = atual.anterior;
        anterior.proximo = novoNo;
        novoNo.anterior = anterior;
        novoNo.proximo = atual;
        atual.anterior = novoNo;
    }
    
  
}
    
