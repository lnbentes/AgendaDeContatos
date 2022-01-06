package br.com.agenda.lucas.teste;

import br.com.agenda.lucas.modelo.BancodeDadosStream;

import java.io.IOException;


public class Teste {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        BancodeDadosStream contatos = new BancodeDadosStream();

        contatos.adicionarNovoContato("lucas", "errt", "1234");
        contatos.adicionarNovoContato("toso", "afrg", "4321");
//
//        contatos.gravar();

//        contatos.leitura();
        contatos.listarContatos();

        contatos.localizarContato("LuCas");

        contatos.excluirContato(1);

        contatos.listarContatos();


    }
}
