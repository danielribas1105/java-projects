package model;

public class Carro extends Veiculo{

    private String tipo;
    private int capacidadePessoas;

    public Carro() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + getModelo() +
                "tipo='" + tipo + '\'' +
                ", capacidadePessoas=" + capacidadePessoas +
                '}';
    }
}
