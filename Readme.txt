>>> PROGRAMAÇÃO ORIENTADA A OBJETO: (abstração ao mundo real):

----- Linguagem de alto nível: maior interação humana
----- Fluxo comportamental: objetos do contexto
----- Procedimentos e funções dos objetos

>>> CONCEITO DE CLASSE:

----- Classe: modelo de um objeto
----- Identificador: NomeDaClasse
----- Características: informações do objeto (suas propriedades)
----- Comportamentos: como o objeto se "comporta"
----- Instanciar: criação de um objeto a partir de um modelo predefinido = classe

>>> TIPOS DE CLASSE:

----- Classe de modelo: atores/entidades - Pessoa, por exemplo.
----- Classe de serviços: regras de negócio e validação de funções do sistema - validação de LOGIN, por exemplo.
----- Classe de repositório: responsável por integrar a aplicação com o banco de dados - configuracoesBD, por exemplo.
----- Classe de controle: integra a aplicação com serviços ou aplicações externas - API e webservices, por exemplo.   
----- Classe utilitária: recursos comum a todo sistema - equação de cálculo do frete, por exemplo. 

>>> PACOTES:

----- São 'pastas' ou 'subdiretórios' que organizam as diferentes classes por categorias, com a finalidade de melhorar a organização do sistema - a partir da pasta principal da aplicação src.

>>> CONVENÇÃO DE NOMENCLATURAS DE PACOTES:
----- Comercial: com.nomedaempresa
----- Governamental: gov.nomedaempresa
----- Código aberto: org.nomedaempresa

----- model
----- repository
----- service
----- controller
----- view
----- util

>>> VISIBILIDADE DE RECURSOS: classes, métodos, funções.

----- default: restringe a visibilidade das classes e métodos por pacotes, apenas as classes e métodos dos mesmos pacotes são visíveis entre si;
----- public: visível para todas as classes e métodos; 
----- private: visível apenas para a própria classe.

>>> PADRONIZAÇÃO DE MÉTODOS --> verboSujeitoPredicado
----- Exemplo: comprarIngredientesSupermercado
----- Explicação =>
		ação: comprar
		o que? - Ingredientes
		onde|como|para que? - Supermercado  
		
>>> MÉTODOS - getters and setters:  
----- Getters: 
		* Atribuído a uma propriedade private 
			Exemplo: private String nome;
			
 		* O método é necessariamente público;
 		* O método precisa ser do mesmo tipo do atributo 
 			Exemplo: public String getNome() {}; 

OBJETIVO DO MÉTODO: retornar o valor do atributo privado <nome> de forma pública.

----- Setters:
		* Atribuído a uma propriedade private
			Exemplo: private int idade;
		
		* O método é necessariamente público;
		* O parâmetro do método precisa ser do mesmo tipo do atributo
		* O método é do tipo void, não retorna nenhum valor.
			Exemplo: public void setIdade(int newIdade);
			
OBJETIVO DO MÉTODO: modificar o valor do atributo privado <idade>.

>>> CONSTRUTORES: permitem a criação de um novo objeto da classe, instanciando valores iniciais para o objeto.

----- O construtor não possui retorno
----- O nome do método construtor deve ser o mesmo nome da classe
----- Deve receber parâmetros para a instanciação da classe com valores iniciais.  
----- Atribui ao processo de instanciação da classe, a necessidade de definir valores iniciais para os atributos do objeto (presentes no construtor). 
----- BOAS PRÁTICAS: uso de construtor apenas para definir os atributos extremamente relevantes para a existência de um objeto.
----- Uma classe pode conter mais de um construtor, com atributos diferentes. Essa prática é recomendada apenas quando houver necessidade de definir o mesmo objeto utilizando apenas parte dos atributos.
	EXEMPLO:
	---> Dada a classe Pessoa, com os atributos nome, dt_nasc e nívelEscolaridade, um sistema municial integrado de educação, saúde e segurança pública, teria os três atributos como extremamente relevantes para um cadastro escolar, enquanto um sistema de saúde, apenas os dois primeiros, logo, teríamos:
	
	--- Sistema escolar:
	public Pessoa(String nome, date dt_nasc, String nivelEsc) {
		this.nome = nome;
		this.dt_nasc = dt_nasc;
		this.nivelEsc = nivelEsc;
	}
	
	--- Sistema de saúde:
	public Pessoa(String nome, date dt_nasc) {
		this.nome = nome;
		this.dt_nasc = dt_nasc;
	}   

OBJETIVO DO CONSTRUTOR: garantir que, os atributos extremamente relevantes da classe, sejam definidos na criação do objeto. 
   
>>> ENUMS: tipo especial de classe, onde os objetos são previamente criados, imutáveis e public  
   
	* Utilizados para a criação de objetos que não sofrerão alterações ou que espera-se que raramente sofra. 
   		Exemplo: Estados da Federação, situação civil, grau de escolaridade etc.
   
   
   
>>> Programação estruturada: linear, sequência de instruções.