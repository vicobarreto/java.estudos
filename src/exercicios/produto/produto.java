package exercicios.produto;

public class produto {

    private int id;
    private String name;

    public produto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 1) {
        throw new RuntimeException("id deve ser maior que zero");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    private void validaNome(String nome) {
        if (nome == null || nome.length() < 5) {

            throw new RuntimeException("nome deve ter no minimo 5 caracteres");
        }
    }

    @Override
    public String toString() {
        return "produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
