package TAD7;

public class App {

    public static void main(String[] args) {
        int tamanho = 1000;
        Vetor vetor = new Vetor(tamanho);

        // Medição do tempo de execução do método recursivo
        long inicioRecursivo = System.nanoTime();
        int maiorRecursivo = vetor.encontrarMaiorRecursivo();
        long fimRecursivo = System.nanoTime();
        long tempoRecursivo = fimRecursivo - inicioRecursivo;

        // Medição do tempo de execução do método iterativo
        long inicioIterativo = System.nanoTime();
        int maiorIterativo = vetor.encontrarMaiorIterativo();
        long fimIterativo = System.nanoTime();
        long tempoIterativo = fimIterativo - inicioIterativo;

        System.out.println("Maior elemento (recursivo): " + maiorRecursivo);
        System.out.println("Tempo de execução (recursivo): " + tempoRecursivo + " nanossegundos");
        System.out.println();
        System.out.println("Maior elemento (iterativo): " + maiorIterativo);
        System.out.println("Tempo de execução (iterativo): " + tempoIterativo + " nanossegundos");
    }
}
    

