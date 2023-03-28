package model;

public class Veiculo {

    private String modelo;
    private String marca;
    private String cor;
    private int capacidadeTanque;

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double encherTanque(double valorGasolina){
        return capacidadeTanque * valorGasolina;
    }

    public double encherTanque(double valorGasolina, double desconto) {
        return (capacidadeTanque * valorGasolina) - (capacidadeTanque * valorGasolina) * 0.1;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }
}
