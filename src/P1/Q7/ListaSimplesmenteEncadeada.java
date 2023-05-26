public class ListaSimplesmenteEncadeada {
    private No inicio;

    public void imprime_rec() {
        imprimeRecursivo(inicio);
    }

    private void imprimeRecursivo(No no) {
        if (no == null) {
            return;
        }

        System.out.println(no.valor);
        imprimeRecursivo(no.proximo);
    }
}