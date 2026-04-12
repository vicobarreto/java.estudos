package listasva1.jogosdacopa;

public class Ingresso {
    private Pessoa pagante;
    private  Jogo jogo;
    private  String assento;

    public Ingresso(Pessoa pagante, Jogo jogo, String assento) {
        setPagante(pagante);
        setJogo(jogo);
        setAssento(assento);
    }

    public Pessoa getPagante() {

        return pagante;
    }

    public void setPagante(Pessoa pagante) {
        if(pagante == null) {
            throw new IllegalArgumentException();
        }
        this.pagante = pagante;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        if(jogo == null) {
            throw new IllegalArgumentException();
        }
        this.jogo = jogo;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        if(assento == null) {
            throw new IllegalArgumentException();
        }
        this.assento = assento;
    }
}
