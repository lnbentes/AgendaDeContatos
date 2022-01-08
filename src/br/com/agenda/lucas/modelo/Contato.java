package br.com.agenda.lucas.modelo;

import java.io.Serial;
import java.io.Serializable;

public class Contato implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private final String nome;
    private final String endereco;
    private final String numero;

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

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
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
