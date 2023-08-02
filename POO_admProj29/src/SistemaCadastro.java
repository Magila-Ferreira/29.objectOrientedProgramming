
public class SistemaCadastro {
	public static void main(String[] args) {
		// Criamos uma pessoa no sistema
		Pessoa p1 = new Pessoa("Marcelo", "128.456.785-95");
						
		// Definimos o endereço de Marcos
		p1.setEndereco("Rua dois, nº 23, jd. Primavera, Interlagos-SP");
		
		// Como definir o nome e cpf do Marcos?
		
		// Imprimindo p1
		System.out.println("Pessoa 1 -> \n" +
				"\tNome: " + p1.getNome() + "\n" +
				"\tCPF: " + p1.getCpf() + "\n" +
				"\tEndereço: " + p1.getEndereco());
	}
}
