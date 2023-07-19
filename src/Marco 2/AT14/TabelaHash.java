public class TabelaHash {
    private static final int TAMANHO_INICIAL = 10;
    private static final double FATOR_CARGA_MAXIMO = 0.75;

    private EntradaTabela[] tabela;
    private int tamanho;
    private int capacidade;

    public TabelaHash() {
        this.tabela = new EntradaTabela[TAMANHO_INICIAL];
        this.tamanho = 0;
        this.capacidade = TAMANHO_INICIAL;
    }

    public void put(String chave, Object valor) {
        if ((double) tamanho / capacidade >= FATOR_CARGA_MAXIMO) {
            redimensionar();
        }

        int indice = hash(chave);

        while (tabela[indice] != null && !tabela[indice].chave.equals(chave)) {
            indice = (indice + 1) % capacidade; // Estratégia de busca linear
            // Ou use busca quadrática: indice = (indice + i * i) % capacidade;
        }

        if (tabela[indice] == null) {
            tamanho++;
        }

        tabela[indice] = new EntradaTabela(chave, valor);
    }

    public Object get(String chave) {
        int indice = hash(chave);

        while (tabela[indice] != null && !tabela[indice].chave.equals(chave)) {
            indice = (indice + 1) % capacidade; // Estratégia de busca linear
            // Ou use busca quadrática: indice = (indice + i * i) % capacidade;
        }

        if (tabela[indice] != null) {
            return tabela[indice].valor;
        } else {
            return null;
        }
    }

    public void remove(String chave) {
        int indice = hash(chave);

        while (tabela[indice] != null && !tabela[indice].chave.equals(chave)) {
            indice = (indice + 1) % capacidade; // Estratégia de busca linear
            // Ou use busca quadrática: indice = (indice + i * i) % capacidade;
        }

        if (tabela[indice] != null) {
            tabela[indice] = null;
            tamanho--;
        }
    }

    private int hash(String chave) {
        return Math.abs(chave.hashCode() % capacidade);
    }

    private void redimensionar() {
        int novaCapacidade = capacidade * 2;
        EntradaTabela[] novaTabela = new EntradaTabela[novaCapacidade];

        for (EntradaTabela entrada : tabela) {
            if (entrada != null) {
                int indice = hash(entrada.chave);

                while (novaTabela[indice] != null) {
                    indice = (indice + 1) % novaCapacidade;
                }

                novaTabela[indice] = entrada;
            }
        }

        tabela = novaTabela;
        capacidade = novaCapacidade;
    }
}