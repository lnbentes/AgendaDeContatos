package br.com.agenda.lucas.teste;

import br.com.agenda.lucas.modelo.BancoDeDados;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        BancoDeDados contatos = new BancoDeDados();

        contatos.leitura();

        int opcao;

        String nome, endereco, telefone, contato;

        do{
            System.out.println("Escolha a opção: 1-Incluir  2-Listar  3-Excluir 4-Localizar 5-Sair");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("entre com o Nome do contato:");
                    nome = entrada.next();
                    System.out.println("entre com o Endereco do contato:");
                    endereco = entrada.next();
                    System.out.println("entre com o Telefone do contato:");
                    telefone = entrada.next();
                    contatos.adicionarNovoContato(nome, endereco, telefone);
                    System.out.println("Contato Armazenado com suceso");
                }
                case 2 -> contatos.listarContatos();
                case 3 -> {
                    System.out.println("Qual o nome do contato que deseja excuir?");
                    contato = entrada.next();
                    contatos.excluirContato(contato);
                }
                case 4 -> {
                    System.out.println("Qual o nome do contato que deseja localizar?");
                    contato = entrada.next();
                    contatos.localizarContato(contato);
                }
                default -> System.out.println("Opção Inválida! Tente novamente."); // Opção Invalida!
            }

        }while(opcao != 5);

        contatos.gravacao();

    }
}
