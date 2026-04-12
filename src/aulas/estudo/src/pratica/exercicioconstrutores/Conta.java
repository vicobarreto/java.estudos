package pratica.exercicioconstrutores;

public class Conta {
 private int numeroconta;
 private String nome;
 private double conta;
private double deposito;
private double saque;

    public Conta(int numeroconta, String nome) {
        this.numeroconta = numeroconta;
        this.nome = nome;
        this.conta = 0;
    }

    public Conta(int numeroconta, String nome, double conta) {
        this.numeroconta = numeroconta;
        this.nome = nome;
        this.conta = conta;
    }



    public int getNumeroconta() {
        return numeroconta;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void depositoinicial( double minhaContadeposito){
        conta = minhaContadeposito + conta;
    }
    public void depositar( double deposito) {
conta = deposito + conta;
    }
    public void sacar( double saque ){
        if(saque > 0 && saque <= this.conta) {
            conta =  saque - conta;
            System.out.println("Saque realizado com sucesso!");
        } else {

            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
        }


    }
}
