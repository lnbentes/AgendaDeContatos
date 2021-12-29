package br.com.agenda.lucas.teste;

import br.com.agenda.lucas.modelo.BancodeDados2;
import br.com.agenda.lucas.modelo.Contato;

import java.io.IOException;


public class Teste {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        BancodeDados2 contatos = new BancodeDados2();

//        contatos.adicionarContato("lucas", "errt", "1234");
//        contatos.adicionarContato("toso", "afrg", "4321");
//
//        contatos.gravar();

        contatos.leitura();
        contatos.listadeContatos();

        contatos.localizarContato("Lucas");


    }
}
