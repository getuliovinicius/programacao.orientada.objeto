# Lista de Exercícios 4

Lista de exercícios propostos pelo **Prof. Daniel Facciolo Pires**.

+ Associação

Acesse os **[Códigos](https://github.com/getuliovinicius/programacao.orientada.objeto)**.

## Exercício 1

![Diagrama de Classes](img/lista4exe1.png)

De acordo com o Diagrama de Classes da UML acima:

1. Crie as classes Passageiro, Reserva e Vôo, bem como suas variáveis. Todas as variáveis são encapsuladas.
2. Crie os métodos construtores sem parâmetro e com parâmetros para todas as classes
3. Crie os métodos:
    a) set e get da classe Vôo
    b) set e get da classe Reserva
    c) set e get da classe Passageiro
4. Crie um método de instância na classe Voo que mostra as informações da classe Voo;
5. Crie um método de instância na classe Reserva que mostra as informações da classe Reserva;
6. Crie um método de instância na classe Passageiro que mostra as informações da classe Passageiro;
7. Crie uma classe chamada TestaPassageiro que cria instâncias da classe Passageiro, e testa todos os métodos criados nos itens anteriores

## Exercício 2

![Diagrama de Classes](img/lista4exe2.png)

De acordo com o Diagrama de Classes da UML acima, implemente os métodos:

1. Passageiro

    + construtores
    + getters e setters
    + public String mostra()

2. Onibus

    + construtores
    + getters e setters
    + public String mostra()
    + public void associaPassageiro(Passageiro passageiro){
    + public boolean desvincularPassageiro(Passageiro passageiro){
    + public boolean obterPassageiro(Passageiro passageiro)
    + public boolean obterPassageiro(String cpf){
    + private int obterPosicaoPassageiro(Passageiro passageiro){
    + private int obterPosicaoPassageiro(String cpf){
    + public boolean atualizaPassageiro(Passageiro passageiro){

3. Rodoviaria

    + construtores
    + getters e setters
    + public String mostra()
    + public void associaOnibus(Onibus onibus){
    + public boolean associaPassageiroOnibus(Onibus on, Passageiro pas){
    + public boolean desvinculaOnibus(Onibus onibus){
    + public boolean desvinculaPassageiroOnibus(Passageiro passageiro, Onibus onibus)
    + public boolean obterOnibus(Onibus onibus)
    + public boolean obterPassageiroOnibus(Onibus onibus, Passageiro passageiro)
    + public boolean obterOnibus(int numero)
    + private int obterPosicaoOnibus(Onibus onibus)
    + private int obterPosicaoOnibus(int numero)
    + public boolean atualizaOnibus(Onibus atual, Onibus novo)
    + public boolean atualizaPassageiroOnibus(Onibus onibus, Passageiro passageiro)

4. Faça o TestaRodoviaria para chamar os métodos criados na Rodoviária.
