package br.com.agenda.lucas.modelo;

import java.io.Serializable;

public class Contato implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String endereco;
    private String numero;

    public  Contato (String nome, String endereco, String numero){
        if(nome == null || endereco == null || numero == null){
            throw new NullPointerException("Os dados devem ser Preenchidos");
        }
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
