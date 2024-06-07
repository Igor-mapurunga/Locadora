package Veiculos;

import Interfaces.OperacoesAluguel;
import Interfaces.OperacoesVeiculo;

public class CaminhaoGrande extends Caminhao  {
    public CaminhaoGrande(String modelo, String marca, int capacidadeDeCarga) {
        super(modelo, marca, capacidadeDeCarga);
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão Grande: Modelo - " +
                getModelo() +
                ", Marca - " +
                getMarca() +
                ", Capacidade de Carga - "
                + getCapacidadeDeCarga());
    }

    @Override
    public String toString() {
        return "CaminhaoGrande{" +
                "capacidadeDeCarga=" + getCapacidadeDeCarga() +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                '}';
    }
}