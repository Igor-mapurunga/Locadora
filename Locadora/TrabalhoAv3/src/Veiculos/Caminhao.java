package Veiculos;

import Veiculos.Veiculo;

public abstract class Caminhao extends Veiculo {
    private int capacidadeDeCarga;
    public Caminhao(String modelo, String marca, int capacidadeDeCarga) {
        super(modelo, marca);
        if (capacidadeDeCarga <= 0){
            throw new IllegalArgumentException("Capacidade de carga deve ser maior que zero");
        }
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void exibirDetalhes() {

    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeDeCarga=" + getCapacidadeDeCarga() +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                '}';
    }
}
