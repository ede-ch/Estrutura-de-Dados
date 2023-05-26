package TAD4;

public class App {
    /*
     * Implemente um TAD LSE genérica de modo que seja possível inserir Alunos ou
     * quaisquer outros tipos de objetos.
     * Implemente um método para fazer a impressão da lista.
     */

     ListaSimplesmenteEncadeada<Aluno> lista = new ListaSimplesmenteEncadeada<>();

        Aluno aluno1 = new Aluno("João", 20);
        Aluno aluno2 = new Aluno("Maria", 22);
        Aluno aluno3 = new Aluno("Pedro", 19);

        lista.inserir(aluno1);
        lista.inserir(aluno2);
        lista.inserir(aluno3);

        lista.imprimir();
    }



