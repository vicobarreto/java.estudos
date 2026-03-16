package exercicios.exercicio5;

public class banco {
    int numerodaconta;
    String nome;
    double deposito = 0;

    public double saque(){
        return deposito + 5;
    }

    @Override
    public String toString() {
        return "Conta: " + numerodaconta + " nome " + nome + " Valor na conta " + deposito;
    }


}
