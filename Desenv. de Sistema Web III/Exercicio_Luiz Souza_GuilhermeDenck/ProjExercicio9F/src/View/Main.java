
package View;

import Model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        Aluno a1 = new Aluno();
        
        System.out.println("Digite o nome do Aluno: ");
        a1.setNomeAluno(ler.nextLine());
        System.out.println("Digite a nota 1 do Aluno: ");
        a1.setNota1(ler.nextDouble());
        System.out.println("Digite a nota 2 do Aluno: ");
        a1.setNota2(ler.nextDouble());
        System.out.print("Digite as faltas do aluno: ");
        a1.setFaltas(ler.nextInt());
        System.out.println("Digite o total de Aulas: ");
        a1.setTotalAulas(ler.nextInt());    
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(a1);
        System.out.println("Mostrar Média: "+a1.calcularMedia());
        System.out.println("Mostrar Frequência: "+a1.calcularFrequencia());
        System.out.println(a1.calcularResultadoFinal());
 }
}