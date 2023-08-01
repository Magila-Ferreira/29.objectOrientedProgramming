package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("Controlando a entrada dos ítens");
	}
	private void controlarSaida() {
		System.out.println("Controlando a saída dos ítens");
	}
	void entregarIngredientes() {
		System.out.println("Entregando ingredientes");
		// Chama função da própria classe:
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("Almoxarife trocando o gás");
	}
}
