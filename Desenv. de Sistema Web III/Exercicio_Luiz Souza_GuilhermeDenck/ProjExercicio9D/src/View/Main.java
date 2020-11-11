package View;

import Model.Programa;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Programa p1 = new Programa();
        
        System.out.println("Digite o numero 1: ");
        p1.setNumero1(ler.nextInt());
        System.out.println("Digite o numero 2: ");
        p1.setNumero2(ler.nextInt());
        System.out.println("Digite o numero 3: ");
        p1.setNumero3(ler.nextInt());
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(p1);
        System.out.println("O numero Maior é: "+p1.maior());
        System.out.println("O numero Menor é: "+p1.menor());
    }
 
}
