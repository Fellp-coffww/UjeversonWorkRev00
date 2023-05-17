package Fellp;
import java.text.DecimalFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainConversation {



    public void Chamadas() throws Exception {

        String Global ="";
        IntegraçãoChrome Ic = new IntegraçãoChrome();
        InterfaceUser Pdr = new InterfaceUser();
        EnviaMensagem Env = new EnviaMensagem();
        LeMensagem Lenv = new LeMensagem();
        Receita receita = new Receita();
        Receita Ingredientes = new Receita();
        ListaIngredientes ls = new ListaIngredientes();
        Ic.webDriver();
        ArrayList<Receita> receitas = new ArrayList<>();
        Mensagem msg = new Mensagem();
        msg.setContatos("anotações");
        msg.setConteudo(Pdr.getWelcome());
        Env.EnviarMensagem(msg, Ic.getWebDriver());
        Lenv.LerMensagem(msg,Ic.getWebDriver());
        msg.AtualizaMSG();

while (msg.getConteudoRecebido().equals("6") == false){
    Lenv.LerMensagem(msg,Ic.getWebDriver());
    msg.AtualizaMSG();
    while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem()) == true){

        Lenv.LerMensagem(msg,Ic.getWebDriver());

    }

        switch (msg.getConteudoRecebido()) {


            case "1":

                if (receita.tamanhoLista() <= 1){

                    msg.setConteudo(Pdr.getException1());
                    Env.EnviarMensagem(msg, Ic.getWebDriver());
                    Thread.sleep(3000);
                    msg.setConteudo(Pdr.getCadIngredient1());
                    Env.EnviarMensagem(msg, Ic.getWebDriver());

                    break;
                }
                else{


                    msg.setConteudo(Pdr.getCadRecipe1());
                    Env.EnviarMensagem(msg, Ic.getWebDriver());
                    Lenv.LerMensagem(msg,Ic.getWebDriver());
                    msg.AtualizaMSG();
                    while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                        Lenv.LerMensagem(msg,Ic.getWebDriver());
                        System.out.println(msg.getConteudoRecebido());
                    }
                    receita.setNomeReceita(msg.getConteudoRecebido());
                    Thread.sleep(3000);
                    while(msg.getConteudoRecebido().equals("NAO".toLowerCase())==false) {

                    Receita receitatemp = new Receita();
                    receitatemp.setNomeReceita(msg.getConteudoRecebido());
                    String ListaIngredientes = "Lista de ingredientes que podem ser adicionados:\n";
                    ListaIngredientes = ListaIngredientes + receita.retornaListaIngredientes();
                    System.out.println(ListaIngredientes );
                    msg.setConteudo(ListaIngredientes);
                    Env.EnviarMensagem(msg, Ic.getWebDriver());
                    String CriarReceita = "Adicione o Ingrediente que desejar na receita pelo seu respectivo número!" +
                            "\n" +"Digite o n° do ingrediente a ser adicionado: ";
                    msg.setConteudo(CriarReceita);
                    Env.EnviarMensagem(msg, Ic.getWebDriver());
                    int LeituraIndex = 0;
                        Lenv.LerMensagem(msg, Ic.getWebDriver());
                        msg.AtualizaMSG();
                        System.out.println(msg.getConteudoRecebido());
                        System.out.println(msg.getUltimaMensgaem());
                        while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem()) == true) {
                            Lenv.LerMensagem(msg, Ic.getWebDriver());
                            System.out.println(msg.getConteudoRecebido());
                        }
                        Global = msg.getConteudoRecebido();
                        Scanner global = new Scanner(Global);
                        LeituraIndex = global.nextInt();
                        receita.setGambiarraIDX(LeituraIndex);

                        receitatemp.setNome(receita.getIngredienteByIdx(LeituraIndex).getNome());
                        receitatemp.setPreco(receita.getIngredienteByIdx(LeituraIndex).getPreco());
                        receitatemp.setPesoUNI(receita.getIngredienteByIdx(LeituraIndex).getPesoUNI());

                        msg.setConteudo("Ingrediente: " + receita.getIngredienteByIdx(LeituraIndex).getNome() + " adicionado com sucesso!");
                        Env.EnviarMensagem(msg, Ic.getWebDriver());
                        msg.AtualizaMSG();
                        Lenv.LerMensagem(msg, Ic.getWebDriver());
                        msg.setConteudo(Pdr.getCadIngredient4());
                        Env.EnviarMensagem(msg, Ic.getWebDriver());
                        Lenv.LerMensagem(msg, Ic.getWebDriver());
                        msg.AtualizaMSG();
                        System.out.println(msg.getConteudoRecebido());
                        System.out.println(msg.getUltimaMensgaem());
                        while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem()) == true) {
                            Lenv.LerMensagem(msg, Ic.getWebDriver());
                            System.out.println(msg.getConteudoRecebido());
                        }
                        Global = msg.getConteudoRecebido();
                        Scanner global2 = new Scanner(Global);
                        receitatemp.setPesoReceita(global2.nextDouble());
                        msg.setConteudo(Pdr.getControl1());

                        Env.EnviarMensagem(msg, Ic.getWebDriver());
                        Lenv.LerMensagem(msg, Ic.getWebDriver());
                        msg.AtualizaMSG();
                        receita.addReceita(receitatemp);

                        while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem()) == true) {
                            Lenv.LerMensagem(msg, Ic.getWebDriver());
                            System.out.println(msg.getConteudoRecebido());
                        }


                    }
                    receitas.add(receita);
                    break;


                }


            case "2":

                Ingrediente Ing = new Ingrediente();
                msg.setConteudo(Pdr.getCadIngredient1());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                msg.AtualizaMSG();
                //Envia a primeira mensagem e espera o resultado diferente de nulo
                while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                    Lenv.LerMensagem(msg,Ic.getWebDriver());
                    System.out.println(msg.getConteudoRecebido());
                }

                //Set de valor do nome do ingrediente
                Ing.setNome(msg.getConteudoRecebido());
                System.out.println(Ing.getNome());
                //Envia a primeira mensagem para adicionar o peso
                msg.setConteudo(Pdr.getCadIngredient2());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                msg.AtualizaMSG();
                //Envia a segunda mensagem e espera o resultado diferente de nulo
                while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                    Lenv.LerMensagem(msg,Ic.getWebDriver());
                    System.out.println(msg.getConteudoRecebido());
                }
                //Set de valor do peso do ingrediente
                String temp = msg.getConteudoRecebido();
                Scanner sc = new Scanner(temp);
                Ing.setPesoUNI(sc.nextDouble());
                //Envia a primeira mensagem para adicionar o preço
                msg.setConteudo(Pdr.getCadIngredient3());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                msg.AtualizaMSG();
                //Envia a terceira mensagem e espera o resultado diferente de nulo
                while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                    Lenv.LerMensagem(msg,Ic.getWebDriver());
                }
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                String temp2 = msg.getConteudoRecebido();
                Scanner sc2 = new Scanner(temp2);
                Ing.setPreco(sc2.nextDouble());
                receita.addIngrediente(Ing);

                break;



            case "3":

                msg.setConteudo(Pdr.getControl2());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                msg.AtualizaMSG();
                String global4 = "";
                String global5 = "";
                for (int n = 0 ; n < receitas.size(); n++){
                        global4 = global4 + n+". "+ receitas.get(n).getNomeReceita()+"\n";
                }
                msg.setConteudo(global4);
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                msg.AtualizaMSG();
                while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                    Lenv.LerMensagem(msg,Ic.getWebDriver());
                    System.out.println(msg.getConteudoRecebido());
                }
                String global3 = msg.getConteudoRecebido();
                Scanner lp = new Scanner(global3);
                int x1 = lp.nextInt();
                msg.setConteudo("Ingredientes: \n "+receitas.get(x1).retornaListaIngredientes());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                msg.setConteudo("Digite o n° do ingrediente a ser removido: ");
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                msg.AtualizaMSG();
                while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                    Lenv.LerMensagem(msg,Ic.getWebDriver());
                    System.out.println(msg.getConteudoRecebido());
                }
                global5 = msg.getConteudoRecebido();
                Scanner lp1 = new Scanner(global5);
                int control1 = lp1.nextInt();
                msg.setConteudo("Ingrediente: " + receitas.get(x1).getIngredienteByIdx(control1).getNome());
                receitas.get(x1).deleteIngrediente(control1);
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                msg.setConteudo("Ingredientes: \n "+receitas.get(x1).retornaListaIngredientes());
                Env.EnviarMensagem(msg, Ic.getWebDriver());

                break;

             case "4":

                 msg.setConteudo(Pdr.getControl4());
                 Env.EnviarMensagem(msg, Ic.getWebDriver());
                 Lenv.LerMensagem(msg,Ic.getWebDriver());
                 msg.AtualizaMSG();
                 String global6 = "";
                 String global7 = "";
                 int x3 = 0;
                 for (int n = 0 ; n < receitas.size(); n++){
                     global6 = global6 + n+". "+ receitas.get(n).getNomeReceita()+"\n";
                 }
                 msg.setConteudo(global6);
                 Env.EnviarMensagem(msg, Ic.getWebDriver());
                 Lenv.LerMensagem(msg,Ic.getWebDriver());
                 msg.AtualizaMSG();
                 while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                     Lenv.LerMensagem(msg,Ic.getWebDriver());
                     System.out.println(msg.getConteudoRecebido());
                 }
                 Scanner global8 = new Scanner(msg.getConteudoRecebido());
                 x3 = global8.nextInt();
                 double precoReceita = 0;
                 for(int n = 0; n < receitas.get(x3).tamanhoLista(); n++){

                 precoReceita = precoReceita +  (receitas.get(x3).getIngredienteByIdx(n).getPesoReceita() * receitas.get(x3).getIngredienteByIdx(n).getPreco())/receitas.get(x3).getIngredienteByIdx(n).getPesoUNI();

                }

                msg.setConteudo("O preço da receita: " + receitas.get(x3).getNomeReceita() + " é de: " + new DecimalFormat("#,##0.00").format(precoReceita) +" R$." );
                 Env.EnviarMensagem(msg, Ic.getWebDriver());
                 break;

            case "5":




        }

    msg.setConteudo(Pdr.getWelcome());
    Env.EnviarMensagem(msg, Ic.getWebDriver());
}





        }

    }








