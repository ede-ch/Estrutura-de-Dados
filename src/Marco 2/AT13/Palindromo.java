
public class Palindromo {
    public static boolean verificarPalindromo(String palavra) {
        Pilha pilha = new Pilha(palavra.length());

        // Empilha os caracteres da palavra
        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        // Desempilha os caracteres e verifica se a palavra é um palíndromo
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != pilha.desempilha()) {
                return false;
            }
        }

        return true;
    }
}