package Fellp;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class StartApplication {

    public static void main(String[] args) throws Exception {

        MainConversation mainConversation = new MainConversation();
        mainConversation.Chamadas();

    }

    public static void MSGTeste(){

        IntegraçãoChrome Ic = new IntegraçãoChrome();
        Ic.webDriver();
        Mensagem msg = new Mensagem();
        msg.setContatos("Luiz [TSE]");
        msg.setConteudo("Palmeiras não tem mundial");
        EnviaMensagem Env = new EnviaMensagem();
        Env.EnviarMensagem(msg, Ic.getWebDriver());

    }

    public static void IngredienteTeste() throws Exception {


        Scanner scanner = new Scanner(System.in);
        ArrayList <Ingrediente> Menu = new ArrayList<>();
        Ingrediente ing = new Ingrediente();
        ing.setNome("Fellp");
        ing.setPreco(12.5f);
        ing.setPesoUNI(78.45);
        ing.setPesoREC(7.24);
        Ingrediente ing2 = new Ingrediente();
        ing2.setNome("Fellp2");
        ing2.setPreco(21.5f);
        ing2.setPesoUNI(54.47);
        ing2.setPesoREC(9.25);
        Menu.add(ing);
        Menu.add(ing2);

/*
        for(int n = 0; n < Menu.size(); n++ ){

            System.out.println(Menu.get(n).getNome());
            System.out.println("\n");
            System.out.println(Menu.get(n).getPesoUNI());
            System.out.println("\n");
            System.out.println(Menu.get(n).getPesoREC());
            System.out.println("\n");
            System.out.println(Menu.get(n).getPreco());
            System.out.println("\n");

        }
  */

    }




}
