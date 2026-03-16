package exercicios.exercicio1;

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" veja  area, perimetro e diagonal do retandulo.");
        System.out.println("digite o valor da altura do retangulo: ");

        double altura = input.nextDouble();
        System.out.println("digite o valor da largura do retangulo: ");
        double largura = input.nextDouble();

        double area = altura * largura;
        double perimetro = (altura * 2 ) + (largura * 2);
        double diagonal = Math.sqrt(Math.pow(area,2) + Math.pow(perimetro,2));

        System.out.println("a area do retangulo é: " + area);
        System.out.println("o perimetro do retangulo é: " + perimetro);
        System.out.println("a diagonal do retamgulo é: " + diagonal);
    }
}
