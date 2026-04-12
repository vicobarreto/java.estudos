package listasva1.jogosdacopa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TesteSistema {
    public static void main(String[] args) {
        RepositorioIngressos repo = new RepositorioIngressos();

        try {
            Pessoa A = new Pessoa("Vinicius", 1649651449, "Brazil");
            Pessoa B = new Pessoa("Joao", 123456789, "Argentina");
            Pessoa C = new Pessoa("Cristiano", 70070077, "Portugal");


            LocalDateTime horarioJ1 = LocalDateTime.of(2026, 6, 15, 16, 0);
            LocalDateTime horarioJ2 = LocalDateTime.of(2026, 6, 15, 19, 0);
            Jogo j1 = new Jogo("Flamengo", "Boca Juniors", "ilha do retiro", horarioJ1);
            Jogo j2 = new Jogo("Benfica", "Flamengo", "arena Pernambuco", horarioJ2);


            Ingresso ing1 = new Ingresso(A, j1, "setor Norte - A21");
            Ingresso ing2 = new Ingresso(B, j2, "setor Norte - B21");
            Ingresso ing3 = new Ingresso(C, j2, "setor Norte - B22");

            repo.adicionarIngresso(ing1);
            repo.adicionarIngresso(ing2);
            repo.adicionarIngresso(ing3);

            System.out.println("--RELATORIO DE VENDAS--");

            System.out.println("Comprador do ingresso 1 vem de: " + ing1.getPagante().getPais());
            System.out.println("Comprador do jogo 2:");
            System.out.println("Equipes: " + ing2.getJogo().getEquipeA() + "vs " + ing2.getJogo().getEquipeB());
            System.out.println("Local: " + ing2.getJogo().getEstadio());

            System.out.println("\n pessoas que compraram o ingresso para o jogo do Brasil");
            List<String> nomesBrasil = repo.buscarNomesPorSelecao("Brazil");
            for (String nome : nomesBrasil) {
                System.out.println("- " + nome);

                System.out.println("torcedores assistindo a propria seleção (Portugal)");
                List<Pessoa> nativos = repo.buscarTorcedorNativos("Portugal");
                for (Pessoa p : nativos) {
                    System.out.println("- " + p.getNome() + "(origem: " + p.getPais() + ")");
                }
            }
        }catch (IllegalArgumentException e){
                System.err.println("Erro de validação! dados invalidos detectados! ");
            }
        }
    }

