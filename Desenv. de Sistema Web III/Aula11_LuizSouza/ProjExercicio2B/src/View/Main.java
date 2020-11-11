package View;

import Model.Categoria;
import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class Main {
    public static void main(String[] args) {
           Scanner ler = new Scanner(System.in);
           //instanciamos a classe:
           Categoria c1 = new Categoria();
           
           //pede e lê:
           System.out.println("Digite seu nome: ");
           c1.setNome(ler.nextLine());
           System.out.println("Digite sua idade: ");
           c1.setIdade(ler.nextInt());
           
           //mostra resultados:
           System.out.println("\n\nRESPOSTAS: ");
           System.out.println(c1);
           System.out.println("Sua categoria será: "+c1.classificar());
    }
}
