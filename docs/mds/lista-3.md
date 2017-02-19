# Lista de Encapsulamento e Criação de Pacotes
# Prof. Daniel F. Pires

## Exercício 1

+ Crie uma classe em Java chamada Cliente contendo as variáveis de instância private numeroConta (String), numeroAgencia (String), nome (String) e saldo (float), e os métodos getters e setters para todas as variáveis privadas. Para a criação dos métodos setters, o número da conta deve obrigatoriamente ter tamanho 8, contando o traço do dígito verificador. O número da agência deve ter tamanho 6, também contando o traço do dígito verificador. Verificar em ambos os casos a presença do dígito verificador. O nome do cliente não pode ultrapassar 30 caracteres. O saldo da conta não tem restrição;

+ Coloque a classe Cliente em um pacote;

+ Crie os métodos public  realizarDeposito() e realizarSaque() que, realizam depósito e saque, respectivamente, na conta do cliente. Crie um outro método public para imprimir o numero da conta, nome da agencia, nome do cliente e saldo atual. Crie um método construtor para inicialização das variáveis quando um objeto da classe for criado. Forneça um construtor sem argumento com valores default caso nenhum inicializador seja fornecido;

+ Crie um arquivo .jar do seu projeto. Em seguida, crie outro projeto para testar sua classe Cliente. Adicione o .JAR do primeiro projeto nesse segundo projeto.

+ Criar uma classe Teste para instanciação da classe Cliente como Fulano. Chamar os métodos realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado. Nao se esqueça de importar a classe Cliente na classe Teste.

+ Tente acessar as variáveis de instância da classe Cliente sem os métodos get e set. O que acontece?

+ Criar, também na classe teste, um outro cliente (Beltrano) e realizar as mesmas atividades do Fulano. Nao se esqueça de importar a classe Cliente na classe Teste.

## Exercício 2

+ Crie uma classe em Java chamada Aluno contendo as variáveis de instância private numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float), e os métodos getters e setters para todas as variáveis privadas. Para a criação dos métodos setters, assuma que: o número do aluno deve ter tamanho exatamente igual a 6. O nome do aluno não pode ultrapassar tamanho 30. A idade, e as notas p1 e p2 não podem ser negativas.

+ Coloque a classe Aluno em um pacote;

+ Crie os métodos public notaFinal() - que calcula e imprime a média final do aluno - , e dadosAluno() - que imprime as variáveis de instância numeroAluno, nome e idade. Crie um construtor para inicialização das variáveis quando um objeto da classe for criado. Forneça um construtor sem argumento com valores default caso nenhum inicializador seja fornecido

+ Crie um arquivo .jar do pacote definido anteriormente, e adicione-o à variável classpath ou ao projeto do NetBeans

+ Criar uma classe Teste para instanciação da classe Aluno e chamada dos métodos notaFinal() e dadosAluno()).

+ Tente acessar as variáveis de instância da classe Aluno sem os métodos get e set. O que acontece?

+ Adicionar o método public passou() à classe Aluno a fim de verificar se o aluno passou. Alterar a classe Teste a fim de testar o método passou()
