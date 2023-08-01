package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	// Default
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando lanche natural hamburguer no balcão");
	}
	// Default
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando suco no balcão");
	}
	// Default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("Preparando lanche tipo hamburguer");
	}
	private void prepararVitamina() {
		System.out.println("Preparar suco");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionando pão, salada, ovo e carne");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionando fruta, leite e suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina liquidificador");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando carne e ovo para o hamburguer");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}	
}
