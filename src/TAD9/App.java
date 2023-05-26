package TAD9;

public class App {

    public class Main {
        public void main(String[] args) {
            Vetor vetor = new Vetor(1000);
            vetor.preencherAleatorio();
    
            System.out.println("Vetor original:");
            vetor.exibir();
    
            long startTime = System.nanoTime();
            vetor.bubbleSort();
            long endTime = System.nanoTime();
    
            System.out.println("Vetor ordenado (Bubble Sort):");
            vetor.exibir();
    
            long duration = (endTime - startTime) / 1000000;
            System.out.println("Tempo de execução (Bubble Sort): " + duration + " ms");
    
            // Aplicar outros métodos de ordenação (selectionSort, insertionSort) de maneira similar
    
        }
    }
    
}
