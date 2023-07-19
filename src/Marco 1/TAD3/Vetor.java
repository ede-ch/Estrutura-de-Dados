package TAD3;

public class Vetor {

    //atributos
    //array de alunos
    private Aluno[] vetor;
    //quantidade de alunos
    private int totalAlunos;

    //construtor    
    public Vetor(int capacidade) {
        this.vetor = new Aluno[capacidade];
        this.totalAlunos = 0;
    }
    //métodos
    //adiciona aluno no vetor de alunos e incrementa o total de alunos   
    public void adiciona(Aluno aluno) {
        this.vetor[this.totalAlunos] = aluno;
        this.totalAlunos++;
    }
    //retorna o total de alunos
    public int tamanho() {
        return this.totalAlunos;
    }
    //verifica se o aluno está no vetor de alunos
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalAlunos; i++) {
            if (aluno.equals(this.vetor[i])) {
                return true;
            }
        }
        return false;
    }
}