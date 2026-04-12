package teoria.construtores;

public class construtores {
    /*

    -iniciar valores
    -permitir ou obrigar a voce fornecer alguns dados na hora de instanciar o objeto

    construtor padrao ( Product p = new Product();
    palavra this( é uma referencia para o proprio objeto)
    sobrecarga(oferece mais de uma operação com o mesmo nome, porem com diferentes listas de parametros)

    encapsulamento(esconder detalhes, expondo apenas operacoes seguras e que mantenham os objetos em um estado consistente)
    os atributos devem ser privados e devem ser acessados por meio de getters e setters
     */

    private String name;
    private double price;
    private int quantity;

    public construtores(String  name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }



}
