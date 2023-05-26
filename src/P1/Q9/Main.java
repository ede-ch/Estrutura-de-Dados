package P1.Q9;

public class Main {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);

        n1.proximo = n2;
        n2.anterior = n1;

        System.out.println(n1.proximo.anterior.valor);
    }
    
}
