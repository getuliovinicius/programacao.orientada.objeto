# Lista de Exercícios 6

Lista de exercícios propostos pelo **Prof. Daniel Facciolo Pires**.

+ Classes Abstrata

Acesse os **[Códigos](https://github.com/getuliovinicius/programacao.orientada.objeto)**.

## Exercício 1

Crie uma hierarquia de classes para representar os diferentes tipos de funcionários de um escritório que tem os seguintes cargos: gerente, assistente, vendedor. Escreva uma classe base abstrata chamada Funcionario que declara um método abstrato:

```java
float calculaSalario()
```

Esta classe também deve definir os seguintes atributos:
- nome (tipo String)
- matricula (tipo String)
- salario_base (tipo double).

Use encapsulamento e forneça um construtor que recebe os valores correspondentes a serem armazenados nos respectivos atributos. Esta classe abstrata deverá ser estendida pelas outras classes representativas dos tipos de funcionários,portanto devem ser escritas as classes Gerente, Assistente e Vendedor. Em cada classe deve-se sobrescrever o método calculaSalario de forma que cálculo do salário é feito assim:

- O gerente recebe duas vezes o salário_base
- O assistente recebe o salário_base
- O vendedor recebe o salário_base mais uma comissão definida no construtor de sua classe.

Crie uma classe Teste com um método main que cria um objeto de cada tipo e os armazena em uma lista e depois calcula a folha salarial dos três funcionários e imprime o valor total. Indique quais conceitos de POO você usou e como foi usado.

## Exercício 2

Explique os resultados da execução do método `main` abaixo e quais são os conceitos fundamentais de orientação a objetos que são aplicados.

```java
public abstract class Ator {
    public abstract void ato();
}

public class AtorFeliz extends Ator {
    public void ato() {
        System.out.println("Ator feliz");
    }
}

public class AtorTriste extends Ator {
    public void ato() {
        System.out.println("Ator triste");
    }
}

public class Palco {
    private Ator ator = new AtorFeliz();
    public void altera() {
        ator = new AtorTriste();
    }
    public void atuar() {
        ator.ato();
    }
}

public class Programa {
    public static void main(String[] args) {
        Palco palco = new Palco();
        palco.atuar();
        palco.altera();
        System.out.print();alco.atuar();
    }
}
```

### Exercício 3

+ Escreva uma classe abstrata chamada CartaoWeb.
+ Essa classe representa todos os tipos de cartões web e conterá apenas um atributo:
    - destinatario (tipo String).
+ Nessa classe você deverá também declarar o método public abstract void showMessage().
+ Crie classes filhas da classe CartaoWeb:
    - DiaDosNamorados
    - Natal
    - Aniversario.
+ Cada uma dessas classes deve conter um método construtor que receba o nome do destinatário do cartão.
+ Cada classe também deve implementar o método showMessage(), mostrando uma mensagem ao usuário com seu nome e que seja específica para a data de comemorativa do cartão.
+ Escreva um programa e no método main crie um array de CartaoWeb.
+ Insira instâncias dos 3 tipos de cartões neste array.
+ Após, use um laço for para exibir as mensagens deste cartão chamando o método showMessage().
+ Em que linha(s) acontece polimorfismo nesse código?
