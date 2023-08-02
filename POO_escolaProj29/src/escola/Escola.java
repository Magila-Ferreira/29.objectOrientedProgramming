package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Felipe");
		aluno1.setIdade(8);
		aluno1.setSexo('M');
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Mágila");
		aluno2.setIdade(30);
		aluno2.setSexo('N');
		
		System.out.println("ALUNOS: ");
		System.out.println("1. nome: " + aluno1.getNome() + ", idade: " + aluno1.getIdade() + ", sexo: " + aluno1.getSexo() + ".");
		System.out.println("2. nome: " + aluno2.getNome() + ", idade: " + aluno2.getIdade() + ", sexo: " + aluno2.getSexo() + ".");
	}
}
