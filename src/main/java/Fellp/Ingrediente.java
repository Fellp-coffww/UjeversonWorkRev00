package Fellp;
import java.util.Scanner;

public class Ingrediente {

    private Scanner sc = new Scanner(System.in);
    private String nome;
    private double pesoUNI;
    private double pesoREC;

    private float preco;


    public double CaculaPreco() {

        Double totalUsado = this.preco * this.pesoUNI / this.pesoREC;

        return totalUsado;
    }

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

    public double getPesoREC() {
        return pesoREC;
    }

    public void setPesoREC(double pesoREC) {
        this.pesoREC = pesoREC;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public  void criaIngrediente() {

        System.out.print("Add new Name for ingredient: ");
        this.setNome(sc.nextLine());
        System.out.print("Add new PesoUni for ingredient: ");
        this.setPesoUNI(sc.nextDouble());
        System.out.print("Add new PesoRec for ingredient: ");
        this.setPesoREC(sc.nextDouble());
        System.out.print("Add new Preco for ingredient: ");
        this.setPreco(sc.nextFloat());

    }

    public String toString(){

        return  "Ingrediente: " + this.getNome()+ " Peso: " + this.getPesoUNI() + " Preço: " + this.getPreco()+"\n";


    }

}
