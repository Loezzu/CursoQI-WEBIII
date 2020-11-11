package View;

import Model.Funcionario;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario();
        
        System.out.println("Digite o salário fixo: ");
        f1.setSalarioFixo(ler.nextDouble());
        System.out.println("Digite o valor das vendas: ");
        f1.setValorVendas(ler.nextDouble());
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(f1);
        System.out.println("A comissão que o funcionário ganhará será: "+f1.calcularComissao());
        System.out.println("O salário final do funcionário: "+f1.calcularSalarioFinal());
    }
}
