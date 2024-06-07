package Veiculos;

import Interfaces.OperacoesAluguel;
import Interfaces.OperacoesVeiculo;

public class CaminhaoPequeno extends Caminhao{
    public CaminhaoPequeno(String modelo, String marca, int capacidadeDeCarga) {
        super(modelo, marca, capacidadeDeCarga);
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão Pequeno: Modelo - " +
                getModelo() +
                ", Marca - " +
                getMarca() +
                ", Capacidade de Carga - "
                + getCapacidadeDeCarga());
    }

    @Override
    public String toString() {
        return "CaminhaoPequeno{" +
                "capacidadeDeCarga=" + getCapacidadeDeCarga() +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                '}';
    }
}