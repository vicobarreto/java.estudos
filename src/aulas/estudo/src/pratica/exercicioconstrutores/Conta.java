package pratica.exercicioconstrutores;

public class Conta {
 private int numeroconta;
 private String nome;
 private double conta;


    public Conta(int numeroconta, String nome) {
        this.numeroconta = numeroconta;
        this.nome = nome;
        this.conta = 0;
    }

    public Conta(int numeroconta, String nome, double depositoinicial) {
        this.numeroconta = numeroconta;
        this.nome = nome;
        depositar(depositoinicial);
    }



    public int getNumeroconta() {
        return numeroconta;
    }



    public String getNome() {
        return nome;
    }



    public double getConta() {
        return conta;
    }






    public void depositar( double deposito) {
conta += deposito;
    }
    public void sacar( double saque ){
            conta -= saque + 5.0;
            System.out.println("Saque realizado com sucesso!");


    }
    public String toString() {
        return "Conta: " + numeroconta + ", nome:  " + nome + ", saldo:  $" +String.format("%.2f", conta);
    }
}
