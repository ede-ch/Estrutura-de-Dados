
public class Main {
    public static void main(String[] args) {
        // Testando a classe Pilha
        Pilha pilha = new Pilha(5);
        pilha.empilha('A');
        pilha.empilha('B');
        pilha.empilha('C');
        pilha.imprime(); // Pilha: A B C

        char elementoDesempilhado = pilha.desempilha();
        System.out.println("Elemento desempilhado: " + elementoDesempilhado); // Elemento desempilhado: C

        System.out.println("Tamanho da pilha: " + pilha.tamanho()); // Tamanho da pilha: 2

        System.out.println("Pilha vazia? " + pilha.vazia()); // Pilha vazia? false

        char topoPilha = pilha.topo();
        System.out.println("Elemento no topo da pilha: " + topoPilha); // Elemento no topo da pilha: B

        pilha.imprime(); // Pilha: A B

        // Testando a classe Palindromo
        String palavra1 = "arara";
        boolean palindromo1 = Palindromo.verificarPalindromo(palavra1);
        System.out.println(palavra1 + " é um palíndromo? " + palindromo1); // arara é um palíndromo? true

        String palavra2 = "banana";
        boolean palindromo2 = Palindromo.verificarPalindromo(palavra2);
        System.out.println(palavra2 + " é um palíndromo? " + palindromo2); // banana é um palíndromo? false

        // Testando a classe Fila
        Fila fila = new Fila();
        fila.enfileira('A');
        fila.enfileira('B');
        fila.enfileira('C');

        System.out.println("Tamanho da fila: " + fila.tamanho()); // Tamanho da fila: 3

        char elementoDesenfileirado = fila.desenfileira();
        System.out.println("Elemento desenfileirado: " + elementoDesenfileirado); // Elemento desenfileirado: A

        System.out.println("Fila vazia? " + fila.vazia()); // Fila vazia? false
    }
}