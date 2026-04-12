package aulas;
import java.util.ArrayList;
import java.util.List;
public class ufrpeuml {
    public static void main(String[] args) {

      /*
       def, inicialização , população
       array list = criação e manipulação , metodos= adicionar, remover, recuperar , concatenar)
       wrapper(boxing e unboxing) - usando foreach com arraylist
rece um tipo como parametro

      */
ArrayList<String> nomes = new ArrayList();
nomes.add("Joao");
nomes.add("pedro");
if(nomes.contains("pedro")) {
    nomes.remove("pedro");
}
    System.out.println(nomes.size());
for(int i = 0; i < nomes.size(); i++) {
    System.out.println(nomes.get(i));
}
for(String nome : nomes) {
    System.out.println(nome);
}
/*
integer i = new integer(1);
integer i = new integer(2);

        ArrayList <Double> numero = new ArrayList();

        Author a1 = new Author("leandro", "aaaa@gmail.com");
        Author a2 = new Author("joao", "JOAO123@gmail.com");
        Author a3 = new Author("maria", "IJFAOI@gmail.com");

        Author[] autores = {a1, a2, a3, a4};
a3 = null;

*/
    }

}
