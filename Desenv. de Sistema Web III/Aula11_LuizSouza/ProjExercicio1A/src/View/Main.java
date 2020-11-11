package View;

import Model.Pessoa;
import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Instaciamos:
        Pessoa p1 = new Pessoa();        
        //Pede e lê:
        System.out.println("Digite sua altura: ");
        p1.setAltura(ler.nextDouble());
        System.out.println("Digite seu sexo: "
                + "\n1- Feminino"
                + "\n2- Masculino");
        p1.setSexo(ler.nextByte());
        if(p1.getSexo()<1 || p1.getSexo()>2){
            System.out.println("ERRO! digite 1 ou 2");
        }
        //Mostra resultados:
        System.out.println("\n\nRESPOSTAS:");
        System.out.println(p1);
        System.out.println("Peso Ideal: "+p1.calcularPesoIdeal());
    }
}
