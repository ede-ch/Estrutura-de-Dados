package TAD2;

public class PlanoCartesiano {

    // atributos
    private PontoCartesiano p1;
    private PontoCartesiano p2;

    // construtor
    public PlanoCartesiano(PontoCartesiano p1, PontoCartesiano p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // métodos getters e setters
    public PontoCartesiano getP1() {
        return p1;
    }

    public PontoCartesiano getP2() {
        return p2;
    }

    public void setP1(PontoCartesiano p1) {
        this.p1 = p1;
    }

    public void setP2(PontoCartesiano p2) {
        this.p2 = p2;
    }

    // método que calcula a distância euclidiana entre dois pontos
    public double distanciaEuclidiana() {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return distancia;
    }
}
