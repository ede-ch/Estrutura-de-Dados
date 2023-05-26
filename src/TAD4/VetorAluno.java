package TAD4;

public class VetorAluno {

    private Aluno alunos[] = new Aluno[5];
    private int totalAlunos = 0;

    public void adiciona(Aluno aluno) {
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    public int tamanho() {
        return totalAlunos;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalAlunos; i++) {
            if (this.alunos[i].getNome().equals(aluno.getNome())) {
                return true;
            }
        }
        return false;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
}
