package View;

import Model.Salario;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Salario s1 = new Salario();
        
        System.out.println("Digite o nome do funcionario: ");
        s1.setNomeFuncionario(ler.nextLine());
        System.out.println("Digite o valor que o funcionario ganha por hora; ");
        s1.setValorHora(ler.nextDouble());
        System.out.println("Digite a carga horaria mensal do funcionario: ");
        s1.setCargaHoraria(ler.nextDouble());
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(s1);
        System.out.println("O Salario Mensal do funcionario "+s1.getNomeFuncionario() + " é: "+s1.calcularSalarioMensal());
    }
}
