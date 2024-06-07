package Clientes;

import Interfaces.OperacaoCadastro;
import Leitura.LeituraArquivo;

import java.util.List;
import java.util.Scanner;

public class Clientes implements OperacaoCadastro {
    private String nome;
    private String anoDeNascimento;
    private int idade;
    private String cpf;

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(String anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Clientes(String nome, String anoDeNascimento, int idade, String cpf) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.idade = idade;
        this.cpf = cpf;
    }

    public static void exibirDetalhesClientes(List<Clientes> clientesCadastrados) {
        for (Clientes cliente : clientesCadastrados) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Ano de Nascimento: " + cliente.getAnoDeNascimento());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println();
        }
    }

    public static void cadastrarCliente(List<Clientes> cadastrados, String nomeArquivo) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano de nascimento do cliente: ");
        String anoDeNascimento = scanner.nextLine();

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        Clientes novoCliente = new Clientes(nome, anoDeNascimento, idade, cpf);
        cadastrados.add(novoCliente);

        // Escrever a lista atualizada no arquivo
        LeituraArquivo.escreverClientes(nomeArquivo, cadastrados);
    }

    @Override
    public String toString() {
        return nome + "," + anoDeNascimento + "," + idade + "," + cpf;
    }
}
