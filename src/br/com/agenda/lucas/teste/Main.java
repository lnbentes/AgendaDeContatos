package br.com.agenda.lucas.teste;

import br.com.agenda.lucas.modelo.BancoDeDados;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        BancoDeDados contatos = new BancoDeDados();

        contatos.leitura();

        int opcao = 0, posicao = 0;

        String nome = "", endereco = "", telefone = "";

        do{
            System.out.println("Escolha a opção: 1-Incluir  2-Listar  3-Excluir  4-Sair");

            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("entre com o Nome do contato:");
                    nome = entrada.next();
                    System.out.println("entre com o Endereco do contato:");
                    endereco = entrada.next();
                    System.out.println("entre com o Telefone do contato:");
                    telefone = entrada.next();
                    contatos.adicionarNovoContato(nome, endereco, telefone);
                    System.out.println("Contato Armazenado com suceso");
                    break;

                case 2:
                    contatos.listarContatos();
                    break;

                case 3:
                    System.out.println("Qual contato quer excuir?");
                    posicao = entrada.nextInt();
                    contatos.excluirContato(posicao);
                    break;

                default:
                    // Opção Invalida!
                    System.out.println("Opção Inválida! Tente novamente.");
                    break;

            }

        }while(opcao != 4);

        contatos.gravacao();

    }
}
