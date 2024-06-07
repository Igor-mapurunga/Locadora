package Veiculos;

public class Sedan extends Carro{

    public Sedan(String modelo, String marca, int numeroDePortas) {
        super(modelo, marca, numeroDePortas);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Sedan Carro: Modelo - " +
                getModelo() +
                ", Marca - " +
                getMarca() +
                ", Número de Portas - " +
                getNumeroDePortas());
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "numeroDePortas=" + getNumeroDePortas() +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                '}';
    }

}
