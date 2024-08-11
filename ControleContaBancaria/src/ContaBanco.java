import java.util.Scanner;

public class ContaBanco{

    private String tipo;
    private Cliente cliente;
    private double saldo;
    private boolean status;

    private static final double TAXA_CC = 12.0;
    private static final double TAXA_CP = 20.0;
    private static final double SALDO_INICIAL_CC = 50.0;
    private static final double SALDO_INICIAL_CP = 150.0;

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    public boolean isStatus() { return status; }

    public void setStatus(boolean status) { this.status = status; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente;}

    public void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================================================");
        System.out.println("Bem-Vindo ao Banco ABC\n");
        System.out.println("====================================================================");
        System.out.println("Selecione uma das opções: ");
        System.out.println("1- Abrir conta");
        System.out.println("2- Fechar conta");
        System.out.println("3- Depositar");
        System.out.println("4- Sacar");
        System.out.println("5- Pagamento mensal");
        System.out.println("6- Estado atual da conta");
        System.out.println("0- Sair");
        System.out.println("====================================================================");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option){
            case 0:
                System.out.println("Sessão encerrada.");
                //System.exit(0);
                scanner.close();
                return;
                //break;
            case 1: abrirConta(scanner); break;
            case 2: fecharConta(scanner); break;
            case 3: depositar(scanner); break;
            case 4: sacar(scanner); break;
            case 5: pagarMensal(scanner); break;
            case 6: estadoAtual(scanner); break;
            default:
                System.out.println("Opção Inválida. Tente novamente.");
                menu(); break;
        }
    }
    public void abrirConta(Scanner scanner){
        System.out.println("====================================================================");
        System.out.println("Bem-Vindo ao Banco ABC\n");

        if(!this.isStatus())
        {
            setStatus(true);
            System.out.print("Qual é o nome do titular da conta: ");
            this.setCliente(new Cliente(scanner.nextLine()));

            System.out.println("\n====================================================================");

            System.out.print("\nQual e o tipo de conta? Conta Corrente (CC) ou Conta Poupança (CP):  ");
            this.setTipo(scanner.nextLine());

            if (this.getTipo().equalsIgnoreCase("CC"))
            {
                System.out.println("====================================================================");
                System.out.println("Conta Corrente\n");
                this.setSaldo(SALDO_INICIAL_CC);
                System.out.println(getCliente().getNome() + ", será disponibilizado um saldo de R$50 de boas vindas\n");
            }
            else
            {
                System.out.println("\n====================================================================");
                System.out.println("Conta Poupança\n");
                this.setSaldo(SALDO_INICIAL_CP);
                System.out.println(getCliente().getNome() + ", será disponibilizado um saldo de R$150 de boas vindas\n");
            }
        }
        else
        {
            System.out.println(getCliente().getNome() + ", sua conta já esta aberta.\n");
        }

        System.out.println("Conta " + getTipo());
        System.out.println("Saldo disponivel: R$" + getSaldo());
        System.out.println("\n");
        System.out.println("====================================================================");
        menu();
    }

    public void fecharConta(Scanner scanner){
        System.out.println("====================================================================");
        System.out.println("Banco ABC\n");

        if(this.isStatus()){
            System.out.print("Deseja fechar a sua conta " + getTipo() + " no Banco ABC? S/N ");
            String option = scanner.nextLine();
            System.out.println("====================================================================");

            if(this.getSaldo() == 0){
                if(option.equalsIgnoreCase("s")){
                    this.setStatus(false);
                    System.out.println("====================================================================");
                    System.out.println(getCliente().getNome() + ", sua conta foi encerrada.");
                    System.out.println("====================================================================");
                }
            }else{
                System.out.println(getCliente().getNome() + ", saque todo o saldo disponível antes de fechar a conta.\n");
                System.out.println("Saldo disponível: R$" + this.getSaldo());
            }
        } else{
            System.out.println("====================================================================");
            System.out.println("Não tem conta existente.\n");
            System.out.println("Abra sua conta no Banco ABC.");
        }
        System.out.println("\n");
        menu();
    }

    public void depositar(Scanner scanner){
        System.out.println("====================================================================");
        System.out.println("Despósito\n");

        if(isStatus()){
            System.out.println("Saldo disponível; R$" + getSaldo() + "\n");
            System.out.print("Qual é o valor do depósito: R$");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            setSaldo(getSaldo() + valor);

            System.out.println("\nSaldo disponível: R$" + getSaldo());
        } else{
            System.out.println("Antes de depositar, abra sua conta no Banco ABC.\n");
        }
        System.out.println("\n");
        System.out.println("====================================================================");
        menu();
    }

    public void sacar(Scanner scanner){
        System.out.println("====================================================================");
        System.out.println("Saque\n");

        if(isStatus()){
            System.out.print("Saldo disponível: R$" + getSaldo() + "\n");
            System.out.print("Qual é o valor para sacar: R$");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso.\n");
            } else{
                System.out.println("Saque indisponível. Efetue um depósito.\n");
            }

            System.out.println("Saldo disponível: R$" + getSaldo());
        } else{
            System.out.println("Antes de sacar, abra sua conta no Banco ABC.");
        }
        System.out.println("\n");
        System.out.println("====================================================================");
        menu();
    }

    public void pagarMensal(Scanner scanner){
        System.out.println("====================================================================");
        double mensalidade = getTipo().equalsIgnoreCase("CC") ? TAXA_CC : TAXA_CP;

        if(isStatus()){
            if(getSaldo() > mensalidade){
                System.out.println("Pagamento de contas mensais.\n");
                System.out.print("Qual o valor da conta a pagar: R$");
                double pagamento = scanner.nextDouble();
                scanner.nextLine();

                if(getSaldo() > pagamento){
                    setSaldo(getSaldo() - pagamento);
                    setSaldo(getSaldo() - mensalidade);

                    System.out.println("Pagamento realizado com sucesso.\n");
                    System.out.println("pagamento da mensalidade de R$" + mensalidade + " realizada com sucesso.\n");
                    System.out.println("Saldo disponível: R$" + getSaldo());

                } else{
                    System.out.println("Saldo insuficiente para pagamento.Efetue um depósito.");
                }
                System.out.println("Saldo disponível: R$" + getSaldo());
                menu();
            }
        } else{
            System.out.println("Abra sua conta no Banco ABC.");
            menu();
        }
    }

    public void estadoAtual(Scanner scanner){
        System.out.println("====================================================================");
        System.out.println("Banco ABC\n");
        System.out.println("Titular: " + getCliente().getNome());

        if(getTipo().equalsIgnoreCase("CC"))
            System.out.println("Tipo: " + getTipo() + " Conta Corrente.");
        else
            System.out.println("Tipo: " + getTipo() + " Conta Poupança.");

        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Status: " + isStatus());
        System.out.println("\n");
        System.out.println("====================================================================");
        menu();
    }
}
