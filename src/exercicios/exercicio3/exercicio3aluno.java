package exercicios.exercicio3;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
public class exercicio3aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        List<aluno> historico = new ArrayList<>();

        boolean encerrar = false;


        System.out.println("Sistema de notas de alunos");
        while(!encerrar) {

            aluno aluno = new aluno();
            System.out.println("nome do aluno: ");
            aluno.aluno = input.nextLine();

            System.out.println("nota 1 do aluno: (0/30)");
            aluno.nota1 = input.nextDouble();

            System.out.println("nota 2 do aluno: (0/35)");
            aluno.nota2 = input.nextDouble();

            System.out.println("nota 3 do aluno: (0/35)");
            aluno.nota3 = input.nextDouble();

            System.out.println();
            System.out.println("nota final : " + aluno.notafinal());

            if (aluno.notafinal() >= 60){
                System.out.println("aluno: " + aluno.aluno + " PASSOU DE ANO!PARABENS");
            }else {
                System.out.println("aluno: " + aluno.aluno + " NÃO PASSOU DE ANO!");
                System.out.println("pontos faltando: " + aluno.pontosfaltando());
            }

            historico.add(aluno);
            System.out.println("encerrar programa? (true/false): ");
            encerrar = input.nextBoolean();
            input.nextLine();

        }
        System.out.println("historico de relatorios das notas dos alunos! ");
        for(aluno f : historico){
            System.out.println("-aluno: "+ f.aluno + "  nota final: " + f.notafinal());
        }
    input.close();
    }
}
