package TAD3;

public class Main {
    /*
     * Criar uma classe Aluno. Sobre um aluno devem ser guardados:
     * Nome
     * Idade
     * Nota
     * Utilize o TAD Vetor, adaptando-o para armazenar Alunos;
     * Adapte os métodos “adiciona”, “tamanho” e “contem” para o contexto de Alunos;
     */

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        Aluno aluno1 = new Aluno("João", 20, 8.5);
        Aluno aluno2 = new Aluno("Maria", 21, 9.0);
        Aluno aluno3 = new Aluno("José", 22, 7.5);
        Aluno aluno4 = new Aluno("Ana", 23, 9.5);
        Aluno aluno5 = new Aluno("Pedro", 24, 8.0);
        Aluno aluno6 = new Aluno("Paula", 25, 7.0);

        vetor.adiciona(aluno1);
        vetor.adiciona(aluno2);
        vetor.adiciona(aluno3);
        vetor.adiciona(aluno4);
        vetor.adiciona(aluno5);
        vetor.adiciona(aluno6);

        System.out.println("Total de alunos: " + vetor.tamanho());

        System.out.println("Aluno 1 está no vetor? " + vetor.contem(aluno1));
        System.out.println("Aluno 2 está no vetor? " + vetor.contem(aluno2));
        System.out.println("Aluno 3 está no vetor? " + vetor.contem(aluno3));
        System.out.println("Aluno 4 está no vetor? " + vetor.contem(aluno4));
        System.out.println("Aluno 5 está no vetor? " + vetor.contem(aluno5));
        System.out.println("Aluno 6 está no vetor? " + vetor.contem(aluno6));

    }
}
