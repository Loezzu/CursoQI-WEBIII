package View;

import Model.Idade;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Idade i1 = new Idade();
        
        System.out.println("Digite seu ano de nascimento: ");
        i1.setAnoNascimento(ler.nextInt());
        System.out.println("Digite o ano atual: ");
        i1.setAnoAtual(ler.nextInt());
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(i1);
        System.out.println("Sua idade em Anos: "+i1.calcularidadeAnos());
        System.out.println("Sua idade em Meses: "+i1.calcularIdadeMeses());
        System.out.println("Sua idade em Dias: "+i1.calcularIdadeDias());
        System.out.println("Sua idade em Semanas: "+i1.calcularIdadeSemanas());
        System.out.println("Sua idade em Horas: "+i1.calcularIdadeHoras());
        System.out.println("Sua idade em Minutos: "+i1.calcularIdadeMinutos());
        System.out.println("Sua idade em Segundos: "+i1.calcularIdadeSegundos());
        
       
    }
}
