package aulas;

//operadores
import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("DIgite o primeiro numero: ");
        int a = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = input.nextInt();

        System.out.println("a = " + a + ", b = " + b);

        int resultadosoma = a + b;

        int resultadosubtracao = a - b;

        int resultadomult = a * b;

        int resultadodiv = a / b;

        int resultadoresto = a % b;

      boolean resultadomaior = a > b;

      boolean resultadoigual = a == b;

        System.out.println(" resultado da soma a + b é " + resultadosoma);

        System.out.println(" resultado da subtração a - b é " + resultadosubtracao);

        System.out.println("resultado da multiplicação é " + resultadomult);

        System.out.println("resultado da divisão é " + resultadodiv);

        System.out.println("resultado do resto da divisão é " + resultadoresto);

        System.out.println("resultado da comparação igual é " + resultadoigual);

        System.out.println("resultado da comparação maior é " + resultadomaior);
    }
}
