# Lista de Exercícios 1

Lista de exercícios propostos pelo **Prof. Daniel Facciolo Pires**.

+ Classes
+ Objetos
+ Métodos Construtores
+ Variáveis
+ Métodos de instância

Acesse os **[Códigos](https://github.com/getuliovinicius/programacao.orientada.objeto/tree/master/lista-01/src/br/edu/fatecfranca/ads)**.

## Exercício 1:

+ Crie uma classe em Java chamada Aluno contendo as variáveis de instância numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float),
+ Crie o construtor
+ Crie os métodos notaFinal() - que calcula e retorna a média final do aluno - , e dadosAluno() - que retorna os valores de numeroAluno, nome e idade.
+ Criar uma classe TestaAluno com o método main() para instanciação da classe Aluno (atribuição das variáveis de instância com quaisquer valores e chamada dos métodos notaFinal() e dadosAluno()).
+ Adicionar o método passou() à classe Aluno a fim de verificar se o aluno passou. Chame o método passou() na classe TestaAluno a fim de testa-lo.

## Exercício 2:

+ Crie uma classe em Java chamada Cliente contendo as variáveis de instância numeroConta (int), numeroAgencia (int), nome (String) e saldo (float),
+ Crie um método construtor para inicialização das variáveis quando um objeto da classe for criado.
+ Crie os métodos public  realizarDeposito() e realizarSaque() que, realizam depósito e saque, respectivamente, na conta do cliente.
+ Crie um outro método public que retorna o numero da conta, nome do cliente e saldo atual.
+ Criar uma classe TestaCliente para instanciação da classe Cliente como Fulano. Chamar os métodos realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado.
+ Criar, também na classe TestaCliente, um outro cliente (Beltrano) e realizar as mesmas atividades do Fulano.

## Exercício 3:

+ Implemente em Java uma classe chamada Produto contendo as variáveis id (int), descrição (String), qtde (int) e preco (float). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:
+ comprar(int x): que compra um produto aumentando em x a quantidade em estoque;
+ vender(int x): que vende um produto aumentando em x a quantidade em estoque;
+ subir(float x): que aumenta o preço do produto em x unidades;
+ descer(float x): que diminui o preço do produto em x unidades;
+ mostra(): que mostra todas as informações do produto
+ Finalmente, cria uma classe TestaProduto, que cria dois Produtos (cada um deve utilizar um construtor diferente) e teste os métodos criados.

## Exercício 4:

+ Implemente em Java uma classe chamada Rio contendo as variáveis nome(String), nível (float) e poluído (boolean). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:
+ chover(float): que aumenta o nível atual do rio;
+ ensolarar(float): que diminui o nível atual do rio;
+ limpar(): que limpa o rio;
+ sujar(): que polui o rio;
+ mostra(): que mostra todas as informações do rio.
+ Finalmente, cria uma classe TestaRio, que cria dois Rios (cada um deve utilizar um construtor diferente) e teste os métodos criados.
