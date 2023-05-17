package Fellp;

public class InterfaceUser {

    private String Welcome = "Seja bem vindo(a)\n" +
            "O que deseja fazer? OU Qual sua solicitação?\n" +
            "Para prosseguir digite apenas o número referente a uma das opções abaixo:\n" +
            "1.Cadastrar receita\n" +
            "2.Adicionar ingrediente a uma receita\n" +
            "3.Retirar ingrediente de uma receita\n" +
            "4.Descobrir valor de uma receita\n" +
            "5.Descobrir quantas receitas posso fazer com meu orçamento ";

    private String CadIngredient1 = "Digite o nome do Ingrediente: ";
    private String CadIngredient2 = "Digite o peso do ingrediente: ";
    private String CadIngredient3 = "Digite o preço do ingrediente: ";

    private String CadIngredient4 = "Digite o peso a ser usado na receita: ";
    private String CadRecipe1 = "Digite o nome da receita: ";

    private String Control1 = "Deseja adicionar mais um ingrediente? ";
    private String Exception1 = "Cadastre pelo menos mais de um ingrediente!";

    public String getControl1() {
        return Control1;
    }

    public String getWelcome() {
        return Welcome;
    }

    public String getCadIngredient1() {
        return CadIngredient1;
    }

    public String getCadIngredient2() {
        return CadIngredient2;
    }

    public String getCadIngredient3() {
        return CadIngredient3;
    }

    public String getException1() {
        return Exception1;
    }

    public String getCadRecipe1() {
        return CadRecipe1;
    }

    public String getCadIngredient4() {
        return CadIngredient4;
    }
}

