package Veiculos;

public class SUV extends Carro{
    public SUV(String modelo, String marca, int numeroDePortas) {
        super(modelo, marca, numeroDePortas);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("SUV Carro: Modelo - " +
                getModelo() +
                ", Marca - " +
                getMarca() +
                ", Número de Portas - " +
                getNumeroDePortas());
    }

    @Override
    public String toString() {
        return "SUV{" +
                "numeroDePortas=" + getNumeroDePortas() +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                '}';
    }
}