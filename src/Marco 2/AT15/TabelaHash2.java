public class TabelaHash {

  private Lista[] tabela;
  private int tamanho;

  public Object get(String chave) {
    int hash = hash(chave);
    if(tabela[hash] == null) return null;
    
    No no = tabela[hash].getPrimeiro();
    while(no != null) {
      if(no.getChave().equals(chave)) {
        return no.getValor();
      }
      no = no.getProximo();
    }
    return null;
  }

  public void remove(String chave) {
    int hash = hash(chave);
    if(tabela[hash] != null) {
      tabela[hash].remove(chave);
      if(tabela[hash].estaVazia()) {
        tabela[hash] = null;
      }
    }
  }
  
  // método de redimensionamento
  public void redimensiona() {
    Lista[] novaTabela = new Lista[tabela.length * 2];
    
    for(Lista lista : tabela) {
      if(lista != null) {
        No no = lista.getPrimeiro();
        while(no != null) {
          int novoHash = hash(no.getChave());
          if(novaTabela[novoHash] == null) {
            novaTabela[novoHash] = new Lista();  
          }
          novaTabela[novoHash].insere(no);
          no = no.getProximo();
        }
      }
    }
    
    this.tabela = novaTabela;
  }

}