package Fellp;

import java.util.ArrayList;


public class ListaIngredientes {

    private ArrayList<Receita> Menu = new ArrayList<>();

    public Receita getIngredienteByIdx(int Idx) {

        return Menu.get(Idx);

    }


    public void addIngrediente(Receita receita){

        Menu.add(receita);

    }

    public void deleteIngrediente(int Idx){

        Menu.remove(Idx);

    }



    public void editaReceita(int Idx,Receita receita){

        Menu.set(Idx, receita);

    }



    public String retornaIngredientes(){

        String temp = "";

        for (int i = 0; i < Menu.size();i++){
            temp = temp + Menu.get(i).toString();
        }

        return temp;

}


    public String retornaListaIngredientes(){

        String temp = "";

        for (int i = 0; i < Menu.size();i++){
            temp = temp + "-"+i +" "+Menu.get(i).getNome()+"\n";
        }

        return temp;




}

    public int tamanhoLista(){


        return  Menu.size();
    }
}
