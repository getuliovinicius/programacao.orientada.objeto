# Lista de Exercícios 2

Lista de exercícios propostos pelo **Prof. Daniel Facciolo Pires**.

+ Variáveis de Instância X Variáveis de Classe
+ Métodos de Instância X Métodos de Classe
+ Construtores

Acesse os **[Códigos](https://github.com/getuliovinicius/programacao.orientada.objeto/tree/master/lista-02/src/br/edu/fatecfranca/ads)**.

## Exercício 1

+ Crie uma classe em Java chamada Veiculo contendo as variáveis de instância Tipo (String), nroRodas (int), cor (String) e ano (int), e a variável de classe nomeDono (String);
+ Crie os construtores obrigatórios;
+ Crie um método de instância chamado alteraTipo que altera o tipo de um Veiculo;
+ Crie um método de instância chamado mostra que retorna todas as informações de um objeto;
+ Crie um método de classe chamado alteraNome que altera o nome do dono de um veículo;
+ Crie um método de classe chamado retornaNome que retorna o nome do dono de um veículo
+ Crie um método de classe auxiliar chamado nroRodas que recebe o número de rodas e retorna se esse número é par ou ímpar.
+ Crie um método de classe auxiliar chamado retornaNovoVeiculo que recebe dois veículos como parâmetro e retorna um novo veículo contendo o tipo do primeiro veículo, a soma do número de rodas dos dois veículos passados como parâmetro, a cor do segundo veículo, e o ano do maior veículo dentre os dois passados como parâmetro;
+ Criar a classe TestaVeiculo com as seguintes atividades:
	+ Instanciações da classe Veículo com os objetos Carro e Moto;
	+ Impressão das variáveis dos objetos Carro e Moto (chamado do método mostra());
	+ Modificação do conteúdo de todas as variáveis do objeto Moto; Para alterar o nome do dono, utilize o método específico;
	+ Imprimir novamente as variáveis de instância dos objetos Carro e Moto. O que aconteceu com as variáveis do objeto Carro?
	+ Mostre o uso do método nroRodas
	+ Mostre o uso do método retornaNovoVeiculo

## Exercício 2

+ Crie uma classe em Java chamada Cliente contendo as variáveis de instância numeroConta (String), numeroAgencia (String), nome (String) e static saldo (float),
+ Crie um método construtor para inicialização das variáveis quando um objeto da classe for criado. Forneça também um construtor sem argumento com valores default caso nenhum inicializador seja fornecido
+ Crie os métodos de instância realizarDeposito() e realizarSaque() que realizam depósito e saque, respectivamente, na conta do cliente.
+ Crie um outro método de instância para imprimir o numero da conta, nome do cliente e saldo atual.
+ Crie um método de classe que altera o saldo do Cliente
+ Crie um método de classe que retorna o saldo do Cliente
+ Crie um método de instância que altera o número de agência do cliente
+ Crie um método de instância que retorna o número de agência do cliente
+ Crie um método de classe auxiliar chamado retornaNovoCliente que receba dois clientes como parâmetro e retorna um terceiro cliente, sendo que este deve ter a soma dos saldos dos clientes passados como parâmetro, o número de agência do primeiro cliente passado como parâmetro, o número da conta do segundo cliente passado como parâmetro e o nome Fulano.
+ Crie um método de classe auxiliar chamado verificaTamanho que recebe o número da agência de um cliente e retorna se este número tem exatamente tamanho 6.
+ Criar uma classe chamada TestaCliente para instanciação da classe Cliente como Fulano. Chamar os métodos realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado .
+ Criar, também na classe teste, um outro cliente (Beltrano) e realizar as mesmas atividades do Fulano. Realizar testes de modo que apresente como o Fulano pode alterar o saldo de Beltrano.
+ Finalmente, mostre na classe TestaCliente o uso dos métodos retornaNovoCliente e verificaTamanho

## Exercício 3

+ Crie uma classe em Java chamada MeuString. No método main(), str1 deve ser instanciada como "meu primeiro string". Após isso, imprima o comprimento e o caracter na posição 2 de str1 utilizando métodos de instância.
+ Ainda no método main(), crie um str2 (String) a partir do valor do comprimento de str1.  Utilize apenas métodos de classe.

## Exercício 4

+ Crie uma classe em Java chamada Computador contendo uma variável de instância processador (String) e uma variável de classe ram (int).
+ Crie os construtores da classe.
+ Crie um método de instância para alterar o valor do processador
+ Crie um método de classe para alterar o valor da ram
+ Crie ainda um método auxiliar de classe para fazer upgrade na memória (sempre adicionar mais 256 MB).
+ Finalmente, crie uma classe que teste a primeira (ComputadorTeste). Instancie objetos e faça chamadas aos métodos criados com objetivo de testá-los.
