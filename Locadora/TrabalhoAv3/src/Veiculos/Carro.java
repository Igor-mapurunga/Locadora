package Veiculos;

import Veiculos.Veiculo;

public abstract class Carro extends Veiculo {
    private int numeroDePortas;


    public Carro(String modelo, String marca, int numeroDePortas) {
        super(modelo, marca);
        if (numeroDePortas <=0) {
            throw new IllegalArgumentException("Numero de portas deve ser maior que zero");
        }
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroDePortas=" + numeroDePortas +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                '}';
    }
}
