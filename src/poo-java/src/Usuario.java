public class Usuario {
   private String nome;
   private String email;
    private String senha;


    public Usuario(String name) {
    this.nome = name;

    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private  void validaSenha(String senha) {
        if(senha.length() < 6){
            throw new RuntimeException("senha deve ter pelo menos 6 caracteres");
        }
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

   private void validaEmail(String email) {
        if(!email.contains("@")) {
            throw new IllegalArgumentException("email invalido" + email);
        }
   }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
      this.validaEmail(email);
        this.email = email;
    }

    public String getNomecomemail() {

        return this.nome + " <" + this.email + ">";
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
