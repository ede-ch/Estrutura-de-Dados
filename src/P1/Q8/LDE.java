package P1.Q8;

public class LDE {
    private LDENode cabeca;
    private LDENode cauda;
    
    public void concat(LDE outraLista) {
        if (this.cabeca == null) {
            this.cabeca = outraLista.cabeca;
            this.cauda = outraLista.cauda;
        } else if (outraLista.cabeca != null) {
            this.cauda.proximo = outraLista.cabeca;
            outraLista.cabeca.anterior = this.cauda;
            this.cauda = outraLista.cauda;
        }
    }
}
