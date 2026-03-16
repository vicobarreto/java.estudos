package exercicios.exercicio2;


public class funcionario {
        public String nome;
        public double salariobruto;
        public double imposto;

        public double salarioliquido() {
            return salariobruto - imposto;
        }

        public void aumentarsalario(double porcentagem) {
            salariobruto = salariobruto + (salariobruto * (porcentagem / 100.0));
        }


        @Override
        public String toString() {
            return nome + ", $ " + String.format("%.2f", salarioliquido());
        }
    }


