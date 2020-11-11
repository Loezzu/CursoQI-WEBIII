
package View;

import Model.Programa;
import java.util.Scanner;

/**
 *
 * @author Luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        Programa p1 = new Programa();
        
        System.out.println("Digite o nome do Produto: ");
        p1.setNomeProduto(ler.nextLine());
        System.out.println("Digite o valor do Produto: ");
        p1.setValorProduto(ler.nextDouble());
        System.out.println("Digite a quantidade de Produto: ");
        p1.setQuantidadeProduto(ler.nextInt());
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(p1);
        System.out.println("O valor total: "+p1.valorTotal());
        System.out.println("O valor total com Desconto: "+p1.valorComDesconto());
        System.out.println("O valor total com Juros: "+p1.valorComJuros());
    }
}
