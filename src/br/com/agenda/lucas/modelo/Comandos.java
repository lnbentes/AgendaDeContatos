package br.com.agenda.lucas.modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class Comandos {

    private ArrayList<Contato> contatoArmazenado;//O que coloca no <> vai especificar o tipo do array

    public Comandos() throws IOException {
        this.contatoArmazenado = new ArrayList<Contato>();
    }

    public void adicionarContato(String nome, String endereco, String telefone){
        this.contatoArmazenado.add(new Contato(nome, endereco, telefone));
    }

    public void adicionarUmaConta(Contato referencia){
        this.contatoArmazenado.add(referencia);
    }

    public void listadeContatos(){
        this.contatoArmazenado.sort(// Organozar a lista pela ordem alfabatica
                new Comparator<Contato>() {
                    @Override
                    public int compare(Contato c1, Contato c2) {
                        String comparacao1 = c1.getNome();
                        String comparacao2 = c2.getNome();
                        return comparacao1.compareTo(comparacao2);
                    }
                }
        );
        System.out.println("----------Inicio da Lista de Contatos----------");
        this.contatoArmazenado.forEach( Contato -> System.out.println(Contato));
        System.out.println("----------Fim da Lista de Contatos--------------");
    }

    public void excluirContato(int posicao) {
        this.contatoArmazenado.remove(posicao - 1);
        System.out.println("Contato Excluido: ");
    }

    public void localizarContato(String nome) {
        int i = 0;
        for (Contato contato : this.contatoArmazenado) {
            if(contato.getNome().contains(nome)){
                System.out.println(contato);
                i =1;
            }
        }

        if(i == 0){
            System.out.println("Contato nao localizado");
        }
    }

    public Contato getContato(int referencia) {
        return this.contatoArmazenado.get(referencia);
    }

    public int getTamanhoDaAgenda() {
        return this.contatoArmazenado.size();
    }

    public String getNome(int posicao){
        return this.contatoArmazenado.get(posicao).getNome();
    }
    public String getEndereco(int posicao){
        return this.contatoArmazenado.get(posicao).getEndereco();
    }
    public String getTelefone(int posicao){
        return this.contatoArmazenado.get(posicao).getNumero();
    }



    public void cls() { //"limpa" tela
        for(int i = 0; i < 15; i++)
            System.out.println("");
    }

}
