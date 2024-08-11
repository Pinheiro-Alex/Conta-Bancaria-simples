# Sistema de Banco Simples

Este projeto é uma simulação básica de um sistema de banco em Java. O sistema permite que os usuários abram contas, realizem depósitos, saques, paguem mensalidades e visualizem o estado atual de suas contas.

## Funcionalidades

- **Abrir Conta**: Permite ao usuário abrir uma nova conta, escolher o tipo (Conta Corrente ou Conta Poupança), e receber um saldo inicial.
- **Fechar Conta**: Permite ao usuário fechar a conta, desde que não haja saldo restante.
- **Depositar**: Permite ao usuário adicionar fundos à sua conta.
- **Sacar**: Permite ao usuário retirar fundos da sua conta, desde que haja saldo suficiente.
- **Pagamento Mensal**: Deduz uma taxa mensal específica do tipo de conta e permite que o usuário pague contas.
- **Estado Atual**: Exibe as informações atuais da conta, incluindo titular, tipo de conta, número da conta, saldo, e status.

## Estrutura do Código

- **ContaBanco.java**: A classe principal que contém a lógica para manipular as contas bancárias e as interações com o usuário.
- **Cliente.java**: Uma classe simples para armazenar as informações do cliente, como o nome.
- **Main.java**: O ponto de entrada do programa, que inicia o menu de opções.

## Como Executar

1. **Clone o repositório**:

    ```bash
    git clone https://github.com/seuusuario/sistemabanco.git
    cd sistemabanco
    ```

2. **Compile o código**:

    ```bash
    javac Main.java
    ```

3. **Execute o programa**:

    ```bash
    java Main
    ```

## Exemplo de Uso

Quando você executa o programa, será apresentado um menu com várias opções:

====================================================================

Bem-Vindo ao Banco ABC

====================================================================

Selecione uma das opções: 

1- Abrir conta

2- Fechar conta

3- Depositar

4- Sacar

5- Pagamento mensal

6- Estado atual da conta

0- Sair


## Melhorias Futuras

- Usar o try-catch para garantir que entradas inválidas, como letras em vez de números, sejam tratadas adequadamente. 
- Adicionar persistência de dados para que as contas sejam salvas entre execuções do programa.
- Implementar uma interface gráfica (GUI) para melhorar a interação do usuário.
- Adicionar mais funcionalidades, como transferência entre contas e histórico de transações.
