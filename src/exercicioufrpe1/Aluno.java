package exercicioufrpe1;

import exercicios.exercicio3.aluno;

public class Aluno {
    private String nome;
    private int idade;
    private Curso curso;
    private Curso cursoescolhas[] = new Curso[10];


    public Aluno(Curso[] cursoescolhas) {
        this.cursoescolhas = cursoescolhas;
    }

    public void Curso(){
        for ( int i = 0;i < cursoescolhas.length;i++){
            System.out.println(cursoescolhas[i].getNome());
        }
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Curso curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void exibirinfo(){
        System.out.println("nome: " + getNome() + ", idade: " + getIdade());

      if(curso != null) {
          System.out.print("curso: " + curso.getNome() + " carga horaria: " + curso.getCargaHoraria());

          if(curso.getProfessor() != null){
              System.out.print(" nome do professor: " + curso.getProfessor().getNome() + " especialidade: " + curso.getProfessor().getEspecialidade());
          }
      }

}



}
