package exercicios.exercicio4;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
public class exercicio4dolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        List<dolar> historico = new ArrayList<>();

        boolean encerrado = false;
        System.out.println("Sistema de conversao de reais para dolar");

        while(!encerrado){
            dolar dolar = new dolar();
            System.out.println("Digite seu email: ");
            dolar.email = input.nextLine();

            System.out.println("Qual o valor do dollar atual? ");
            dolar.dolarpreco =  input.nextDouble();

            System.out.println("Quantos dolares voce vai querer comprar?");
            dolar.dolarquantidade =  input.nextDouble();

            dolar.conversordolar();

            System.out.println("Voce vai ter que pagar em reais " + dolar.conversordolar());
            historico.add(dolar);
            encerrado = input.nextBoolean();
            input.nextLine();

        }
        System.out.println("relatorios de compra de dolar!");
        for(dolar f : historico){
            System.out.println("-" + f);
        }
        input.close();
    }

}
