package Fellp;


public class StartApplication {

    public static void main(String[] args) {


        Mensagem msg = new Mensagem();
        msg.setConteudo("Salve salve rapaziada");
        msg.setContatos("Edielson [SENAI]");
        EnviaMensagem Emsg = new EnviaMensagem();
        LeMensagem Lmsg = new LeMensagem();
        IntegraçãoChrome Ic = new IntegraçãoChrome();
        Ic.webDriver();
        var elemento = Emsg.findContato(msg.getContatos(), Ic.getWebDriver());
        elemento.click();
        Lmsg.LerMensagem(msg, Ic.getWebDriver());
        System.out.println(msg.getConteudoRecebido());

    }
}
