package Fellp;
import java.util.Scanner;

public class Ingrediente {

    private Scanner sc = new Scanner(System.in);
    private String nome;
    private double pesoUNI;

    private double preco;

    private double pesoReceita;


    public double ValidaDado() {
        return 0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPesoUNI() {
        return pesoUNI;
    }

    public void setPesoUNI(double pesoUNI) {
        this.pesoUNI = pesoUNI;
    }



    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public  void criaIngrediente() {

        System.out.print("Add new Name for ingredient: ");
        this.setNome(sc.nextLine());
        System.out.print("Add new PesoUni for ingredient: ");
        this.setPesoUNI(sc.nextDouble());
        System.out.print("Add new Preco for ingredient: ");
        this.setPreco(sc.nextFloat());

    }

    public String toString(){

        return  "Ingrediente: " + this.getNome()+ " Peso: " + this.getPesoUNI() + " Preço: " + this.getPreco()+"\n";


    }



    public double getPesoReceita() {
        return pesoReceita;
    }

    public void setPesoReceita(double pesoReceita) {
        this.pesoReceita = pesoReceita;
    }


}
