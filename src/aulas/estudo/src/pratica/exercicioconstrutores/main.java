package pratica.exercicioconstrutores;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
Locale.setDefault(Locale.US);


        System.out.println("sistema bancario!");
        System.out.println("criar conta! ");

        int numero = gerador.nextInt(50); // 0 a 99
        System.out.println("o numero da sua conta é: " + numero);

        System.out.println("Digite o nome do conta: ");
        String nome = input.nextLine();
      //  Conta minhaConta = new Conta(numero, nome);
Conta minhaConta;

        System.out.println("deseja adicionar saldo a sua conta?");
        Boolean sim = input.nextBoolean();
        if (sim) {
            System.out.println("digite o valor do deposito: ");
            double minhaContadeposito = input.nextDouble();
            minhaConta = new Conta(numero , nome , minhaContadeposito);
        }
        else {
            minhaConta = new Conta(numero , nome);
        }

        System.out.println("conta criada com sucesso!");
        System.out.println( minhaConta);

        System.out.println("deseja movimentar sua conta?");
        Boolean movimentar = input.nextBoolean();

        while (movimentar) {
            System.out.println("1 - depositar . 2 - sacar ");
            int opcao = input.nextInt();
            if (opcao == 1) {
                System.out.println("deseja depositar quanto na conta? ");
                double deposito = input.nextDouble();
                minhaConta.depositar(deposito);
            }
            if (opcao == 2) {
                System.out.println("deseja sacar quanto na conta? ");
                double saque = input.nextDouble();
                minhaConta.sacar(saque);

            }
            System.out.println( "numero da conta: " + minhaConta.getNumeroconta() +" nome: " + minhaConta.getNome() + " saldo:" +  minhaConta.getConta());

            System.out.println("deseja continuar operação?");
            Boolean movimentar1 = input.nextBoolean();
            movimentar = movimentar1;

        }


    }
}

