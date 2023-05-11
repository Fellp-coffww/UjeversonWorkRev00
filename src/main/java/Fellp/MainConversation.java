package Fellp;
import java.time.*;


public class MainConversation {



    public void Chamadas() throws InterruptedException {

        IntegraçãoChrome Ic = new IntegraçãoChrome();
        InterfaceUser Pdr = new InterfaceUser();
        EnviaMensagem Env = new EnviaMensagem();
        LeMensagem Lenv = new LeMensagem();
        Ingrediente Ing = new Ingrediente();
        Ic.webDriver();
        Mensagem msg = new Mensagem();
        msg.setContatos("anotações");
        msg.setConteudo(Pdr.getWelcome());
        Env.EnviarMensagem(msg, Ic.getWebDriver());
        Lenv.LerMensagem(msg,Ic.getWebDriver());

        while (msg.getConteudoRecebido().equals("2") == false) {
            Lenv.LerMensagem(msg,Ic.getWebDriver());
            System.out.println("Reading mensage");
            System.out.println(msg.getConteudoRecebido());
        }

        msg.AtualizaMSG();
        Lenv.LerMensagem(msg,Ic.getWebDriver());
        while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem()) == true){

            Lenv.LerMensagem(msg,Ic.getWebDriver());
            switch (msg.getConteudoRecebido()){

            case "1":
                msg.setConteudo(Pdr.getCadIngredient1());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Thread.sleep(10000);
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                Ing.setNome(msg.getConteudoRecebido());

                msg.setConteudo(Pdr.getCadIngredient2());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Thread.sleep(10000);
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                Ing.setPesoUNI(Double.parseDouble(msg.getConteudoRecebido()));

                msg.setConteudo(Pdr.getCadIngredient3());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Thread.sleep(10000);
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                Ing.setPreco(Float.parseFloat(msg.getConteudoRecebido()));

                break;
        }

    System.out.println(Ing.getNome());
        System.out.println(Ing.getPesoUNI());
        System.out.println(Ing.getPreco());
    }}



}


