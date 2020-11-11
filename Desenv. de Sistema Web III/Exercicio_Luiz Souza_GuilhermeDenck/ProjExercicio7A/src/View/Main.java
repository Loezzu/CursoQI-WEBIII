package View;

import Model.Calculo;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Calculo c1 = new Calculo();
        
        System.out.println("Digite o nome do aluno: ");
        c1.setNomeDoAluno(ler.nextLine());
        System.out.println("Digite a nota 1: ");
        c1.setNota1(ler.nextDouble());
        System.out.println("Digite a nota 2: ");
        c1.setNota2(ler.nextDouble());
        System.out.println("Digite a nota 3: ");
        c1.setNota3(ler.nextDouble());
        System.out.println("Digite a nota 4: ");
        c1.setNota4(ler.nextDouble());
        
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(c1);
        System.out.println(c1.getNomeDoAluno() + ", sua média é: "+c1.calcularMedia());
    }
 
}
