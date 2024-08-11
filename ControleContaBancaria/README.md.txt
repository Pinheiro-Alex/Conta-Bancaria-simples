<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de Banco Simples</title>
</head>
<body>
    <h1>Sistema de Banco Simples</h1>

    <p>Este projeto é uma simulação básica de um sistema de banco em Java. O sistema permite que os usuários abram contas, realizem depósitos, saques, paguem mensalidades e visualizem o estado atual de suas contas.</p>

    <h2>Funcionalidades</h2>
    <ul>
        <li><strong>Abrir Conta:</strong> Permite ao usuário abrir uma nova conta, escolher o tipo (Conta Corrente ou Conta Poupança), e receber um saldo inicial.</li>
        <li><strong>Fechar Conta:</strong> Permite ao usuário fechar a conta, desde que não haja saldo restante.</li>
        <li><strong>Depositar:</strong> Permite ao usuário adicionar fundos à sua conta.</li>
        <li><strong>Sacar:</strong> Permite ao usuário retirar fundos da sua conta, desde que haja saldo suficiente.</li>
        <li><strong>Pagamento Mensal:</strong> Deduz uma taxa mensal específica do tipo de conta e permite que o usuário pague contas.</li>
        <li><strong>Estado Atual:</strong> Exibe as informações atuais da conta, incluindo titular, tipo de conta, número da conta, saldo, e status.</li>
    </ul>

    <h2>Estrutura do Código</h2>
    <ul>
        <li><strong>ContaBanco.java:</strong> A classe principal que contém a lógica para manipular as contas bancárias e as interações com o usuário.</li>
        <li><strong>Cliente.java:</strong> Uma classe simples para armazenar as informações do cliente, como o nome.</li>
        <li><strong>Main.java:</strong> O ponto de entrada do programa, que inicia o menu de opções.</li>
    </ul>

    <h2>Como Executar</h2>
    <ol>
        <li><strong>Clone o repositório:</strong></li>
        <pre><code>git clone https://github.com/seuusuario/sistemabanco.git
cd sistemabanco
        </code></pre>

        <li><strong>Compile o código:</strong></li>
        <pre><code>javac Main.java
        </code></pre>

        <li><strong>Execute o programa:</strong></li>
        <pre><code>java Main
        </code></pre>
    </ol>

    <h2>Exemplo de Uso</h2>
    <p>Quando você executa o programa, será apresentado um menu com várias opções:</p>

    <pre><code>====================================================================
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
====================================================================
    </code></pre>

    <p>Você pode escolher uma opção digitando o número correspondente e seguindo as instruções na tela. O programa usa <code>try-catch</code> para garantir que entradas inválidas, como letras em vez de números, sejam tratadas adequadamente.</p>

    <h2>Melhorias Futuras</h2>
    <ul>
        <li>Adicionar persistência de dados para que as contas sejam salvas entre execuções do programa.</li>
        <li>Implementar uma interface gráfica (GUI) para melhorar a interação do usuário.</li>
        <li>Adicionar mais funcionalidades, como transferência entre contas e histórico de transações.</li>
    </ul>

    <h2>Contribuição</h2>
    <p>Sinta-se à vontade para abrir um pull request ou uma issue se tiver sugestões de melhorias ou encontrar bugs.</p>

    <h2>Licença</h2>
    <p>Este projeto é de código aberto e está licenciado sob a <a href="LICENSE">MIT License</a>.</p>
</body>
</html>