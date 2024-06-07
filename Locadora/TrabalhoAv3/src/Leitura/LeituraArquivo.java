package Leitura;
import Clientes.Clientes;
import Veiculos.*;
import java.io.*;
import java.util.List;

public class LeituraArquivo {
    public static void lerVeiculosDeArquivo(String nomeArquivo, List<Veiculo> veiculosDisponiveis) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String tipo = dados[0];
                String modelo = dados[1];
                String marca = dados[2];
                int capacidadeOuCarga = Integer.parseInt(dados[3].trim());

                Veiculo veiculo = null;
                switch (tipo) {
                    case "Sedan":
                        veiculo = new Sedan(modelo, marca, capacidadeOuCarga);
                        break;
                    case "SUV":
                        veiculo = new SUV(modelo, marca, capacidadeOuCarga);
                        break;
                    case "CaminhaoPequeno":
                        veiculo = new CaminhaoPequeno(modelo, marca, capacidadeOuCarga);
                        break;
                    case "CaminhaoGrande":
                        veiculo = new CaminhaoGrande(modelo, marca, capacidadeOuCarga);
                        break;
                }
                if (veiculo != null) {
                    veiculosDisponiveis.add(veiculo);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void lerClientesDoArquivo(String nomeArquivo, List<Clientes> clientesCadastrados) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0];
                String anoDeNascimento = dados[1];
                int idade = Integer.parseInt(dados[2].trim());
                String cpf = dados[3];

                Clientes cliente = new Clientes(nome, anoDeNascimento, idade, cpf);
                clientesCadastrados.add(cliente);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter idade: " + e.getMessage());
        }
    }

    public static void escreverClientes(String nomeArquivo, List<Clientes> clientes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Clientes cliente : clientes) {
                bw.write(cliente.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo de clientes: " + e.getMessage());
        }
    }
}
