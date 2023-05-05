import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class NewClass {
    
     public static void main(String[] args) {     
     
     Scanner sc = new Scanner(System.in);
     
         System.out.println("Digite o nome do ingrediente: ");
         String Nomei = sc.nextLine();
         System.out.println("Digite o preço pago pelo ingrediente: "+Nomei);
         Double PrecoM = sc.nextDouble();
         System.out.println("Digite a gramagem do ingrediente compro:");
         Double GramagemM = sc.nextDouble();
         System.out.println("Digite a gramagem usada na receita: ");
         Double Gramagemi = sc.nextDouble();
         
         Double TotaliUsado = PrecoM * Gramagemi / GramagemM;
         System.out.println(Gramagemi+" do ingrediente "+Nomei+" custará R$"+TotaliUsado);        
         
     
     }
}
