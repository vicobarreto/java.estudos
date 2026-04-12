package listasva1.jogosdacopa;

public class Pessoa {
    private String nome;
    private long CPF;
    private String pais;

    public Pessoa(String nome, long CPF, String pais) {
        this.setNome(nome);
        if( CPF== 0){
            throw new IllegalArgumentException();
        }
        this.CPF = CPF;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()) {
        throw  new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getCPF() {
        return CPF;
    }
}
