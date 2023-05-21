package Fellp;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class StartApplication {

    public static void main(String[] args) throws Exception {


        MainConversation mc = new MainConversation();
        mc.Chamadas();


    }

    public static void MSGTeste()throws Exception {

        IntegraçãoChrome Ic = new IntegraçãoChrome();
        Ic.webDriver();
        Mensagem msg = new Mensagem();
        msg.setContatos("Marcos [Senai]");
        msg.setConteudo("Vilaaaaaaaaaa");
        EnviaMensagem Env = new EnviaMensagem();
        Env.EnviarMensagem(msg, Ic.getWebDriver());
        MainConversation mc = new MainConversation();
        mc.Chamadas();


    }

    public static void IngredienteTeste() throws Exception {


        Scanner scanner = new Scanner(System.in);
        Ingrediente ing = new Ingrediente();
        Receita receita = new Receita();
        ing.setNome("Fellp");
        ing.setPreco(12.5f);
        ing.setPesoUNI(78.45);
        Ingrediente ing2 = new Ingrediente();
        ing2.setNome("Fellp2");
        ing2.setPreco(21.5f);
        ing2.setPesoUNI(54.47);
        receita.addIngrediente(ing);
        receita.addIngrediente(ing2);
        System.out.println(receita.retornaIngredientes());
        ing2.setPreco(27979879798.5f);
        ing.setPreco(1265456.5f);
        receita.editaReceita(1,ing2);
        receita.editaReceita(0,ing);
        System.out.println(receita.retornaIngredientes());
        receita.deleteIngrediente(1);
        System.out.println(receita.retornaIngredientes());
        System.out.println(receita.tamanhoLista());

    }




}
