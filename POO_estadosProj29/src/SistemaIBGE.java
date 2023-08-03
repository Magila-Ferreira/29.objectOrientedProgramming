
public class SistemaIBGE {
	public static void main(String[] args) {
		System.out.println("Estados brasileiros:\n");
		
		// Percorre cada valor do ENUM EstadoBrasileiro
		for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
		System.out.println("\nInformações do Estado do CEARA: \n");
		System.out.println("Nome maiúsculo: " + eb.getNomeMaiusculo());
		System.out.println("Nome: \t\t" + eb.getNome());
		System.out.println("Sigla: \t\t" + eb.getSigla());
		System.out.println("IBGE: \t\t" + eb.getIbge());
	}
}
