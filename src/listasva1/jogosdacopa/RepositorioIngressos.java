package listasva1.jogosdacopa;


import java.util.ArrayList;
import java.util.List;
public class RepositorioIngressos {
private List<Ingresso> listaIngressos = new ArrayList<>();

public void adicionarIngresso(Ingresso i){
    listaIngressos.add(i);
}
    public List<Ingresso> ListarTodos(){
    return listaIngressos;
    }
    public List<String> buscarNomesPorSelecao(String selecao) {
    List<String> nomes = new ArrayList<>();
    for(Ingresso i : listaIngressos) {
        if (i.getJogo().getEquipeA().equalsIgnoreCase(selecao) || i.getJogo().getEquipeB().equalsIgnoreCase(selecao)) {
            nomes.add(i.getPagante().getNome());

        }
    }
    return nomes;
    }
public List<Pessoa> buscarTorcedorNativos(String pais){
    List<Pessoa> torcedores = new ArrayList<>();
    for(Ingresso i : listaIngressos){
        boolean ehdoPais = i.getPagante().getPais().equalsIgnoreCase(pais);
        boolean jogoDaSelecao =  i.getJogo().getEquipeA().equalsIgnoreCase(pais) ||  i.getJogo().getEquipeB().equalsIgnoreCase(pais);
  if(ehdoPais && jogoDaSelecao){
      torcedores.add(i.getPagante());
  }
    }
    return torcedores;
}
}
