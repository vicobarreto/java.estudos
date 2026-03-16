public class App {
    public static void  main(String[] args) {
        System.out.println("POO - Java");

       Usuario usuarioMaria = new Usuario(" maria ", "maria@gmail.com", "12345");
        System.out.println(usuarioMaria);
        System.out.println(usuarioMaria.getNomecomemail());
        Usuario usuariojoao = new Usuario(" joao ", "joao@gmail.com", "45678");
        System.out.println(usuariojoao.getNome());
        usuarioMaria.setEmail("maria.com");
//        meuusuario.nome = "joao";
//        meuusuario.email = "joao@gmail.com";
//        meuusuario.senha = "12345";

//        System.out.println("Nome: "+ meuusuario.nome);
//        System.out.println("Email: "+ meuusuario.email);
//        System.out.println("senha: "+ meuusuario.senha);

    }
}
