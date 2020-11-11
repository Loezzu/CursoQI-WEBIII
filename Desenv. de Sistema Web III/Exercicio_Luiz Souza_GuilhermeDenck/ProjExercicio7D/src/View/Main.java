package View;

import Model.Pessoa;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite o nome: ");
        p1.setNome(ler.nextLine());
        System.out.println("Digite o peso: ");
        p1.setPeso(ler.nextDouble());
        System.out.println("Digite a altura: ");
        p1.setAltura(ler.nextDouble());
        System.out.println("Digite a cor dos olhos:"
                + "\n1- AZUL"
                + "\n2- VERDE"
                + "\n3- CASTANHO CLARO"
                + "\n4- CASTANHO ESCURO");
        p1.setCorDosOlhos(ler.nextInt());
        System.out.println("Digite a cor dos cabelos: "
                + "\n1- CASTANHO ESCURO"
                + "\n2- CASTANHO CLARO"
                + "\n3- LOIRO"
                + "\n4- RUIVO"
                + "\n5- PRETO");
        p1.setCorDosCabelos(ler.nextInt());
        System.out.println("Digite o sexo: "
                + "\n1- MASCULINO"
                + "\n2- FEMININO");
        p1.setSexo(ler.nextInt());
         
        System.out.println("\n\nRESPOSTAS");
        System.out.println(p1);
    }
}
