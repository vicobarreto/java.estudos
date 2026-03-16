package aulas;

import java.util.Scanner;
public class aula5 {
    public static void main(String[] args) {
        System.out.println("mini calculadora");
        Scanner input = new Scanner(System.in);


        System.out.println();
        System.out.println("digite o operador da equação: (+ ou - ou * ou /): ");
        String operador = input.nextLine();

        System.out.println("digite o primeiro numero : ");
        int a = input.nextInt();

        System.out.println("digite o segundo numero : ");
        int b = input.nextInt();

        if (operador.equals("+")) {
            int soma = a + b;
            System.out.println("soma de " + a + " + " + b + " = " + soma);
        } else if (operador.equals("-")) {
            int subtracao = a - b;
            System.out.println("subração de " + a + " - " + b + " = " + subtracao);
        } else if (operador.equals("*")) {
            int multiplicacao = a * b;
            System.out.println("multiplicação de " + a + " * " + b + " = " + multiplicacao);
        } else if (operador.equals("/")) {
            int divisao = a / b;
            System.out.println("divisão de " + a + " / " + b + " = " + divisao);
        } else {
            System.out.println("digite um operador valido");
        }
    }
}
