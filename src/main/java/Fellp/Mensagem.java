package Fellp;

import java.util.Set;
public class Mensagem {

        private String contatos;

        private String conteudoEnviado;

        private String conteudoRecebido;

        private String ultimaMensgaem;

    public String getContatos() {

        return contatos;
    }

    public void setContatos(String contatos) {

        this.contatos = contatos;
    }

    public String getConteudo() {

        return conteudoEnviado;
    }

    public void setConteudo(String conteudo) {

        this.conteudoEnviado = conteudo;
    }

    public String getConteudoRecebido() {
        return conteudoRecebido;
    }

    public void setConteudoRecebido(String conteudoRecebido) {
        this.conteudoRecebido = conteudoRecebido;
    }

    public String getUltimaMensgaem() {
        return ultimaMensgaem;
    }

    public void AtualizaMSG(){

        this.ultimaMensgaem = this.conteudoRecebido;

    }
}

