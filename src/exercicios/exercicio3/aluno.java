package exercicios.exercicio3;

public class aluno {
    public String aluno;
    public double nota1;
    public double nota2;
    public double nota3;
    public double notafinal;
    public boolean passou = false;

    public double notafinal() {
        return nota1 + nota2 + nota3;
    }

    public double pontosfaltando() {
        if (notafinal() < 60.0) {

            return 60.0 - notafinal();

        } else {
            passou = true;
            return 0.0;
        }
    }



}

