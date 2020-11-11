package View;

import Model.Numero;
import java.util.Scanner;

/**
 *
 * @author luixs
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        int numero = ler.nextInt();
        
        Numero n1 = new Numero(numero);
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(n1);
    }
}
