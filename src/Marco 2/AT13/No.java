

public class No {
    private char elemento;
    private No proximo;

    public No(char elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public char getElemento() {
        return elemento;
    }

    public void setElemento(char elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}