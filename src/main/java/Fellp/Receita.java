package Fellp;

import javax.crypto.spec.RC2ParameterSpec;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Receita  extends Ingrediente {



    private String nomeReceita = "";


    private ArrayList<Ingrediente> Menu = new ArrayList<>();

    private ArrayList<Receita> Receita = new ArrayList<>();

    private  double precoReceita = 0;

    public double getPrecoReceita() {
        return precoReceita;
    }


    public Ingrediente getIngredienteByIdx(int Idx) {

       return Menu.get(Idx);

   }

    public Receita getReceitaByIdx(int Idx) {

        return Receita.get(Idx);

    }

   public void addIngrediente(Ingrediente ingrediente){

       Menu.add(ingrediente);

   }
    public void addReceita(Receita receita){

        Receita.add(receita);

    }

   public void deleteIngrediente(int Idx){

    Menu.remove(Idx);

   }

    public double CaculaPreco() {

        Double totalUsado = this.getPreco() * this.getPesoUNI() / this.getPesoReceita();

        return totalUsado;
    }

    public void editaReceita(int Idx,Ingrediente ingrediente){

       Menu.set(Idx, ingrediente);

    }

    private  int gambiarraIDX = 0;


    public String retornaIngredientes(){

        String temp = "";

        for (int i = 0; i < Menu.size();i++){
            temp = temp + Menu.get(i).toString();
        }

       return temp;

    }

    public void SalvaReceita(ArrayList <Receita> Menu) throws Exception{

        Path receita = Paths.get("src/main/java/Fellp/Receita.txt");
        String temp = "";
        for (int i = 0; i < Receita.size();i++){

            temp = temp + Receita.get(i).toString();

        }

        Files.write(receita,temp.getBytes());

    }



    public int tamanhoLista(){


        return  Menu.size();
    }

    public int tamanhoListaRec(){


        return  Receita.size();
    }

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public int getGambiarraIDX() {
        return gambiarraIDX;
    }

    public void setGambiarraIDX(int gambiarraIDX) {
        this.gambiarraIDX = gambiarraIDX;
    }

    public String retornaListaIngredientes(){

        String temp = "";

        for (int i = 0; i < Menu.size();i++){
            temp = temp + i +"."+" "+Menu.get(i).getNome()+"\n";
        }

        return temp;

    }

    public String toString(){

        return  "Ingrediente: " + this.getNome()+ " Peso unitário: " + this.getPesoUNI() + " Preço: " + this.getPreco()+
                " Peso na receita: " +this.getPesoReceita()+"\n";


    }


    public String retornaListaReceita(){

        String temp = "";

        for (int i = 0; i < Receita.size();i++){
            temp = temp + "."+i +" "+Receita.get(i).toString()+"\n";
        }

        return temp;

    }

    public void PrecoReceita(){

        double Res = 0;

        for(int n = 0; n < Receita.size(); n++) {

        Res =  Res + Receita.get(n).getPesoReceita() * Receita.get(n).getPreco() / Receita.get(n).getPesoUNI();


        }
        this.precoReceita = Res;

        }



}


