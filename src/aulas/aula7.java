package aulas;

public class aula7 {
    public static void main(String[] args) {
        System.out.println("lista de nomes (usando arrays)");

        String[] lista = {"Joao", "Maria","vico"};
        for (int i = 0; i < lista.length; i++) {
            System.out.println("- " + lista[i]);
        }
        int[] listInt = {2,4,6,8,10};
        for (int i = 0;i < listInt.length ;i++){
            System.out.println(listInt[i]);
        }
        System.out.println(listInt[2]);
    }
}
