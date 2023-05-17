package Fellp;
import java.time.*;
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
        Ic.webDriver();
        Mensagem msg = new Mensagem();
        msg.setContatos("anotações");
        msg.setConteudo(Pdr.getWelcome());
        Env.EnviarMensagem(msg, Ic.getWebDriver());
        Lenv.LerMensagem(msg,Ic.getWebDriver());
        msg.AtualizaMSG();
        while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem()) == true){

            Lenv.LerMensagem(msg,Ic.getWebDriver());

        }


        switch (msg.getConteudoRecebido()) {


            case "1":

                Ingrediente ing = new Ingrediente();
                ing.setNome("Fellp");
                ing.setPreco(12.5f);
                ing.setPesoUNI(78.45);
                Ingrediente ing2 = new Ingrediente();
                ing2.setNome("Fellp2");
                ing2.setPreco(21.5f);
                ing2.setPesoUNI(54.47);
                receita.addIngrediente(ing);
                receita.addIngrediente(ing);
                receita.addIngrediente(ing);
                receita.addIngrediente(ing2);

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
                    do{



                        Lenv.LerMensagem(msg,Ic.getWebDriver());
                        msg.AtualizaMSG();
                        System.out.println(msg.getConteudoRecebido());
                        System.out.println(msg.getUltimaMensgaem());
                        while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                            Lenv.LerMensagem(msg,Ic.getWebDriver());
                            System.out.println(msg.getConteudoRecebido());
                        }
                        Global = msg.getConteudoRecebido();
                        Scanner global = new Scanner(Global);
                        LeituraIndex = global.nextInt();
                        receita.setGambiarraIDX(LeituraIndex);
                        msg.setConteudo("Ingrediente: " + receita.getIngredienteByIdx(LeituraIndex).getNome() + "adicionado com sucesso!");
                        Env.EnviarMensagem(msg, Ic.getWebDriver());
                        msg.AtualizaMSG();
                        Lenv.LerMensagem(msg,Ic.getWebDriver());
                        msg.setConteudo(Pdr.getCadIngredient4());
                        Env.EnviarMensagem(msg, Ic.getWebDriver());
                        Lenv.LerMensagem(msg,Ic.getWebDriver());
                        msg.AtualizaMSG();
                        System.out.println(msg.getConteudoRecebido());
                        System.out.println(msg.getUltimaMensgaem());
                        while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                            Lenv.LerMensagem(msg,Ic.getWebDriver());
                            System.out.println(msg.getConteudoRecebido());
                        }
                        Global = msg.getConteudoRecebido();
                        Scanner global2 = new Scanner(Global);
                        receita.setPesoReceita(global2.nextDouble());
                        msg.setConteudo(Pdr.getControl1());
                        Env.EnviarMensagem(msg, Ic.getWebDriver());
                        Lenv.LerMensagem(msg,Ic.getWebDriver());
                        msg.AtualizaMSG();
                        while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                            Lenv.LerMensagem(msg,Ic.getWebDriver());
                            System.out.println(msg.getConteudoRecebido());
                        }

                        receita.addReceita(receita);
    

                    }while(msg.getConteudoRecebido().equals("NAO".toLowerCase())==false);

                    break;


                }


            case "2":

                Ingrediente Ing = new Ingrediente();
                msg.setConteudo(Pdr.getCadIngredient1());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                Thread.sleep(5000);
                msg.AtualizaMSG();
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                //Envia a primeira mensagem e espera o resultado diferente de nulo
                while (msg.getConteudoRecebido().equals(msg.getUltimaMensgaem())==true){
                    Lenv.LerMensagem(msg,Ic.getWebDriver());
                    System.out.println(msg.getConteudoRecebido());
                }
                Thread.sleep(3000);
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
                Thread.sleep(3000);
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
                Thread.sleep(3000);
                Lenv.LerMensagem(msg,Ic.getWebDriver());
                String temp2 = msg.getConteudoRecebido();
                Scanner sc2 = new Scanner(temp2);
                Ing.setPreco(sc2.nextDouble());
                Ingredientes.addIngrediente(Ing);
                msg.setConteudo(Pdr.getCadIngredient1());
                Env.EnviarMensagem(msg, Ic.getWebDriver());
                break;
                }





        }

    }






