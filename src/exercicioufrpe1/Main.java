package exercicioufrpe1;

import exercicios.exercicio4.dolar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("jorge", "fisica");
        Professor professor2 = new Professor("leandro","matematica");
        Scanner input = new Scanner(System.in);
        Curso curso = new Curso("ciencia da computacao",30,professor1);
        Curso cursoescolhas = new Curso("engenharia da computação", 30,professor2 );
        Aluno aluno1 = new Aluno("vico", 19, curso);
        Aluno aluno2 = new Aluno("joao", 20);


aluno2.exibirinfo();
aluno1.exibirinfo();

    }
}
