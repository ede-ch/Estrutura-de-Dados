package TAD2;

public class App {
/* 
Implemente o TAD PontoCartesiano em Java
Crie um método construtor;
Getters e Setters;
Crie um método que calcule a distância euclidiana entre dois pontos;
Teste esse TAD em uma classe Main. 
*/

    public static void main(String[] args) {

        PontoCartesiano p1 = new PontoCartesiano(1, 2);
        PontoCartesiano p2 = new PontoCartesiano(4, 6);
        PlanoCartesiano plano = new PlanoCartesiano(p1, p2);
        System.out.println("Distância euclidiana: " + plano.distanciaEuclidiana());
    }
    
}
