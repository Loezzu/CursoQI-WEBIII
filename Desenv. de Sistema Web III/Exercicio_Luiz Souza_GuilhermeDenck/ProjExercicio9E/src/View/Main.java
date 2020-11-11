
package View;

import Model.Pessoa;
import java.util.Scanner;

/**
 *
 * @author Luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite seu nome: ");
        p1.setNome(ler.nextLine());
        System.out.println("Digite seu peso: ");
        p1.setPeso(ler.nextDouble());
        System.out.println("Digite sua ultura: ");
        p1.setAltura(ler.nextDouble());
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(p1);
        System.out.println("seu indice de massa muscular é: "+p1.calcularMassaMuscular());
        System.out.println(p1.pesoIdeal());
    }
}
