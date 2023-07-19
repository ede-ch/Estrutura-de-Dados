package TAD4;

public class Main {

	public static void main(String[] args) {

		// VetorNotasNaoOtimizado vetor = new VetorNotasNaoOtimizado();
		// VetorNotasOtimizado vetor = new VetorNotasOtimizado();
		VetorAluno vetor = new VetorAluno();

		Aluno aluno1 = new Aluno("João", 18, 8.5);
		Aluno aluno2 = new Aluno("Maria", 20, 9.5);
		Aluno aluno3 = new Aluno("José", 19, 7.5);
		Aluno aluno4 = new Aluno("Ana", 21, 6.5);
		Aluno aluno5 = new Aluno("Carlos", 22, 5.5);
		Aluno aluno6 = new Aluno("Pedro", 23, 4.5);

		vetor.adiciona(aluno1);
		vetor.adiciona(aluno2);
		vetor.adiciona(aluno3);
		vetor.adiciona(aluno4);
		vetor.adiciona(aluno5);
		vetor.adiciona(aluno6);

		System.out.println("Tamanho do vetor: " + vetor.tamanho());

		System.out.println("Contém o aluno 1? " + vetor.contem(aluno1));
		System.out.println("Contém o aluno 2? " + vetor.contem(aluno2));
		System.out.println("Contém o aluno 3? " + vetor.contem(aluno3));
		System.out.println("Contém o aluno 4? " + vetor.contem(aluno4));
		System.out.println("Contém o aluno 5? " + vetor.contem(aluno5));
		System.out.println("Contém o aluno 6? " + vetor.contem(aluno6));



	}
}