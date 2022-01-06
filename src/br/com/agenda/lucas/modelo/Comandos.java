package br.com.agenda.lucas.modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class Comandos {

    private final ArrayList<Contato> contatoArmazenado;//O que coloca no <> vai especificar o tipo do array

    public Comandos() throws IOException {
        this.contatoArmazenado = new ArrayList<Contato>();
    }

    public void adicionarNovoContato(String nome, String endereco, String telefone){
        this.contatoArmazenado.add(new Contato(nome, endereco, telefone));
    }

    public void adicionarUmaConta(Contato referencia){
        this.contatoArmazenado.add(referencia);
    }

    public void listarContatos(){
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
        this.contatoArmazenado.forEach(System.out::println);
        System.out.println("----------Fim da Lista de Contatos--------------");
    }

    public void excluirContato(int posicao) {
        try {
            Contato contaExcluida = getContato(posicao);
            this.contatoArmazenado.remove(posicao);
            System.out.println("Contato Excluido: " + contaExcluida.getNome());
        }catch (IndexOutOfBoundsException e){
            System.out.println("Contato nao existe!");
        }
    }

    public void localizarContato(String nome) {
        String nomeEditado = nome.toUpperCase();
        int i = 0;
        for (Contato contato : this.contatoArmazenado) {
            String nomeContatoEditado = contato.getNome().toUpperCase();
            if(nomeContatoEditado.equals(nomeEditado)){
                System.out.println(contato);
                i =1;
            }
        }
        if(i == 0){
            System.out.println("Contato nao localizado");
        }
    }

    public Contato getContato(int posicao) {
        return this.contatoArmazenado.get(posicao);
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

}
