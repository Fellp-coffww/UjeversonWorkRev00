package Fellp;


import java.util.ArrayList;
import java.util.Scanner;


public class StartApplication {

    public static void main(String[] args) {

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

    public static void IngredienteTeste(){


        Scanner scanner = new Scanner(System.in);
        ArrayList <Ingrediente> Menu = new ArrayList<>();


       String option = "";
        while (option.equals("n") != true){

            Ingrediente tIngrediente = new Ingrediente();
            tIngrediente.criaIngrediente();
            Menu.add(tIngrediente);
            System.out.print("Add new Ingrediente? ");
            option = scanner.nextLine();

        }

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


    }

}
