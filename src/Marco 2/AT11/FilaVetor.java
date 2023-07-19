
public class FilaVetor {

  private Object[] elementos;
  private int inicio;
  private int fim;
  private int tamanho;

  public FilaVetor(int capacidade) {
    this.elementos = new Object[capacidade];
    this.inicio = 0;
    this.fim = 0; 
    this.tamanho = 0;
  }

  public boolean adiciona(Object elemento) {
    if (this.tamanho == this.elementos.length) {
      // Fila cheia
      return false; 
    }

    this.elementos[fim] = elemento;
    fim = (fim + 1) % this.elementos.length; 
    this.tamanho++;
    return true;
  }

  public Object remove() {
    if (this.tamanho == 0) {
      // Fila vazia
      return null;
    }

    Object elemento = this.elementos[inicio];
    inicio = (inicio + 1) % this.elementos.length;
    this.tamanho--;
    return elemento; 
  }
  
  public void imprime() {
    if (this.tamanho == 0) {
      System.out.println("Fila vazia");
      return;
    }
    
    for(int i = inicio; i < inicio + tamanho; i++) {
      int idx = i % elementos.length;
      System.out.print(elementos[idx] + " ");
    }
    System.out.println();
  }
  
}