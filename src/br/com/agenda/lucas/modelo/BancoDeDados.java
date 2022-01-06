package br.com.agenda.lucas.modelo;
/*
Convertendo COntato para String depois String para Contato
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BancoDeDados extends Comandos {

    private BufferedWriter bw;
    private Scanner scanner;
    private int arrayNumero1, arrayNumero2, arrayNumero3;
    private ArrayList<String> dados;

    public BancoDeDados() throws IOException {
        this.arrayNumero1 = 0;
        this.arrayNumero2 = 1;
        this.arrayNumero3 = 2;
        this.dados = new ArrayList<>();
    }


    public void leitura() throws IOException {
        this.scanner = new Scanner(new File("bancoDeDados.txt"));

        //lendo
        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            dados.add(linha);
        }
        scanner.close();

        //Converter String para Contatos
        for(int i = 0; i < (dados.size() / 3); i++){

            super.adicionarNovoContato(dados.get(arrayNumero1), dados.get(arrayNumero2), dados.get(arrayNumero3));

            arrayNumero1 = arrayNumero1 + 3;
            arrayNumero2 = arrayNumero2 + 3;
            arrayNumero3 = arrayNumero3 + 3;

        }

    }



    public void gravacao() throws IOException {

        bw = new BufferedWriter(new FileWriter("bancoDeDados.txt"));

        //Convertendo o C0ntato para String
        for(int i = 0; i < super.getTamanhoDaAgenda(); i++){
            this.dados.add(super.getNome(i));
            this.dados.add(super.getEndereco(i));
            this.dados.add(super.getTelefone(i));
        }

        //gravando
        for(int i = 0; i < this.dados.size(); i++){
            bw.write(this.dados.get(i));
            bw.newLine();
        }

        bw.close();

    }

}
