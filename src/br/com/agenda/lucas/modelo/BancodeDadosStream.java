package br.com.agenda.lucas.modelo;
/*
Usando uma class do java io que faz gravacao objetos na memoria
permitindo recuperar depois o objeto que deseja;
usase as class ObjectOutputStream e a ObjectInputStream, o Stream e diferente de filer
stream ler e grava fluxo de dados (ler e grava em binario)
e indicado se queremos salvar o arquivo num servidor remotor
 */
import java.io.*;

public class BancodeDadosStream extends Comandos {

    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private Contato contato;

    public BancodeDadosStream() throws IOException {
    }

    public void leitura() throws IOException, ClassNotFoundException {
        this.ois = new ObjectInputStream(new FileInputStream("contatos.bin"));

        for(int i = 0; i < 2; i++){
            contato = (Contato) ois.readObject();
            this.adicionarUmaConta(contato);
        }
        ois.close();
    }

    public void gravar() throws IOException {
        this.oos = new ObjectOutputStream(new FileOutputStream("contatos.bin"));

        for(int i = 0; i < this.getTamanhoDaAgenda(); i++){

            contato = this.getContato(i);
            this.oos.writeObject(contato);
        }
        oos.close();
    }

}
