package exercicios.exercicio2;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
public class exercicio2funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        List<funcionario> historico = new ArrayList<>();

boolean encerrar = false;
        System.out.println("Sistema de ajuste de salarios");

        while(!encerrar) {
            funcionario funcionario = new funcionario();
            System.out.println("nome do funcionario: ");
            funcionario.nome = input.nextLine();

            System.out.println("salario do funcionario: ");
            funcionario.salariobruto = input.nextDouble();

            System.out.println("taxa do funcionario");
            funcionario.imposto = input.nextDouble();
            System.out.println("salario com taxa : " + funcionario);
            System.out.println();
            System.out.println("quantos porcentos voce quer taxar o salario? ");
            double porcentagem = input.nextDouble();
            System.out.println("calculo de salario...");

            funcionario.aumentarsalario(porcentagem);


            System.out.println("salario atualizado! ");
            System.out.println("salario novo : " + funcionario);

            historico.add(funcionario);
            System.out.println("encerrar programa? (true/false): ");
           encerrar = input.nextBoolean();
           input.nextLine();
        }

        System.out.println(" Historico de salarios atualizados!");
        for(funcionario f : historico){
            System.out.println("- " + f);
        }
        input.close();
    }
}
