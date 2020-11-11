package View;

import Model.Produto;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Produto p1 = new Produto();
        
        System.out.println("Digite o nome do Produto: ");
        p1.setNomeProduto(ler.nextLine());
        System.out.println("Digite o valor do produto: ");
        p1.setValorProduto(ler.nextDouble());
        System.out.println("Digite a quantidade de produto: ");
        p1.setQuantidade(ler.nextInt());
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(p1);
        System.out.println("O Valor total é: "+p1.valorTotal());
        
    }
}
