package TAD3;

public class Aluno {

    // atributos
    private String nome;
    private int idade;
    private double nota;

    // construtor
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    // métodos getters e setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
