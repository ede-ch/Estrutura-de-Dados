package TAD4;

public class Noh {

    private Object elemento;
    private Noh proximo;

    public Noh(Object elemento, Noh proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
    
}
