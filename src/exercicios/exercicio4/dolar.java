package exercicios.exercicio4;

public class dolar {
    public String email;
    public double dolarpreco;
    public double dolarquantidade;
    public double IOF = 0.06;

    public double conversordolar(){
        return dolarpreco   * dolarquantidade * 0.94;
    }

    @Override
    public String toString() {
        return "dolar{" +
                "nome='" + email + '\'' +
                ", dolarpreco=" + dolarpreco +
                ", dolarquantidade=" + dolarquantidade +
                '}';
    }
}
