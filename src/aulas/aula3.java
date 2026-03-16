package aulas;

//if e else
import java.sql.SQLInput;
import java.util.Scanner;
public class aula3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int idade = input.nextInt();

        if(idade >= 18) {
            System.out.println("maior de idade");
        } else if (idade >= 12) {
            System.out.println("adolescente");
        }else {
            System.out.println("criança ");
    }
}
}
