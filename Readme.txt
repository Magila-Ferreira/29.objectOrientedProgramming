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

>>> CONSTRUTORES: permitem a criação de um novo objeto da classe.   
   
   
   
   
   
   
   
   
   
   
   
>>> Programação estruturada: linear, sequência de instruções.