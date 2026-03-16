package aulas;

import java.util.Scanner;

enum diadasemana {
    segunda,
    terca,
    quarta,
    quinta,
    sexta,
    sabado,
    domingo;

}
public class aula6 {
    public static void main(String[] args) {
        System.out.println("Enum e switch case");

        Scanner input = new Scanner(System.in);

        System.out.println("digite um dia da semana: ");
        String dia = input.nextLine();

        diadasemana Diaescolhido = diadasemana.valueOf(dia.toLowerCase());

//        switch(Diaescolhido){
//            case segunda:
//                System.out.println("executando a tarefa de " + Diaescolhido);
//                break;
//            case terca:
//                System.out.println("executando a tarefa de " + Diaescolhido);
//                break;
//            case quarta:
//                System.out.println("executando a tarefa de " + Diaescolhido);
//                break;
//            case quinta:
//                System.out.println("executando a tarefa de " + Diaescolhido);
//                break;
//            case sexta:
//                System.out.println("executando a tarefa de " + Diaescolhido);
//                break;
//            case sabado:
//                System.out.println("executando a tarefa de " + Diaescolhido);
//                break;
//            case domingo:
//                System.out.println("executando a tarefa de " + Diaescolhido);
//                break;
//
//        }
switch (Diaescolhido){
    case segunda -> System.out.println("executando a tarefa da segunda " + Diaescolhido);
    case terca -> System.out.println("executando a tarefa da terca " + Diaescolhido);
    case quarta -> System.out.println("executando a tarefa da quarta " + Diaescolhido);
    case quinta -> System.out.println("executando a tarefa da quinta " + Diaescolhido);
    case sexta -> System.out.println("executando a tarefa da sexta " + Diaescolhido);
    case sabado -> System.out.println("executando a tarefa da sabado " + Diaescolhido);
    case domingo -> System.out.println("executando a tarefa da domingo " + Diaescolhido);
    default -> System.out.println("dia invalido ");
}

    }
}
