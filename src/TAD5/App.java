package TAD5;

public class App {
    /*
     * Implemente um TAD LSE genérica de modo que seja possível inserir Alunos ou
     * quaisquer outros tipos de objetos.
     * Implemente um método para fazer a impressão da lista.
     */
    public static void main(String[] args) {
        
        LSE<Aluno> listaAlunos = new LSE<>();

        Aluno aluno1 = new Aluno("João", 0);
        Aluno aluno2 = new Aluno("Maria", 0);
        Aluno aluno3 = new Aluno("Pedro", 0);

        listaAlunos.inserir(aluno1);
        listaAlunos.inserir(aluno2);
        listaAlunos.inserir(aluno3);

        listaAlunos.imprimir();
    }
}