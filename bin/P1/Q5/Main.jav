

public static void main(String[] args) {
    ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
    
    lista.adicionar(1);
    lista.adicionar(2);
    lista.adicionar(3);
    lista.adicionar(4);
    lista.adicionar(5);
    
    int quantidadePares = lista.nroPares();
    System.out.println("Número de elementos pares: " + quantidadePares);
}
