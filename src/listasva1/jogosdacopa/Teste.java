package listasva1.jogosdacopa;

import java.time.LocalDateTime;

public class Teste {
    public static void main(String[] args) {
        Pessoa A = new Pessoa("Vinicius", 16496514496, "Brasil");
        Pessoa B = new Pessoa("Joao", 123456789, "Argentina");
        Pessoa C = new Pessoa("Cristiano",007007007,"Portugal");

        Jogo j1 = new Jogo("Flamengo", "Boca Juniors", "ilha do retiro", LocalDateTime.now());
        Jogo j2 = new Jogo("Benfica","Flamengo","arena Pernambuco",LocalDateTime.now());

        Ingresso ing1 = new Ingresso(A,j1, "setor Norte - A21");
        Ingresso ing2 = new Ingresso(B,j2, "setor Norte - B21");
        Ingresso ing3 = new Ingresso(C,j2, "setor Norte - B22");

        RepositorioIngressos repo = new RepositorioIngressos();
        repo.adicionaringresso(ing1);

        System.out.println("Pais do comprador: "+ ing1.getPagante().getPaisOrigem());
    }
}
