package Fellp;

public class InterfaceUser {

    private String Welcome = "Seja bem vindo(a)\n" +
            "O que deseja fazer? OU Qual sua solicitação?\n" +
            "Para prosseguir digite apenas o número referente a uma das opções abaixo:\n" +
            "1.Cadastrar receita\n" +
            "2.Adicionar ingrediente a uma receita\n" +
            "3.Retirar ingrediente de uma receita\n" +
            "4.Descobrir valor de uma receita\n" +
            "5. Descobrir o lucro de uma receita \n"+
            "6. Sair";

    private String CadIngredient1 = "Digite o nome do Ingrediente: ";
    private String CadIngredient2 = "Digite o peso do ingrediente: ";
    private String CadIngredient3 = "Digite o preço do ingrediente: ";
    private String CadIngredient5 = "Digite o seu orçamento: ";
    private String CadIngredient4 = "Digite o peso a ser usado na receita: ";
    private String CadRecipe1 = "Digite o nome da receita: ";

    private String Control1 = "Deseja adicionar mais um ingrediente? (sim/nao) ";
    private String Exception1 = "Cadastre pelo menos mais de um ingrediente!";

    private String Control2 = "Selecione a receita a ser editada: ";

    private String Control3 = "Selecione o ingrediente a ser deletado: ";

    private String Control4 = "Selecione a receita a ser consultada: ";

    private String MoneyTrees = "Digite o seu orçamento: ";
    public String getControl2() {
        return Control2;
    }

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

    public String getControl4() {
        return Control4;
    }

    public String getMoneyTrees() {
        return MoneyTrees;
    }

    public String getCadIngredient5() {
        return CadIngredient5;
    }
}

