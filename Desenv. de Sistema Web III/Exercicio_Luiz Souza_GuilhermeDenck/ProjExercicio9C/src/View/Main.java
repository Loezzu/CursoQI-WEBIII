package View;

import Model.Combustivel;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Combustivel c1 = new Combustivel();
        
        System.out.println("Digite a quantidade de litros a abastecer: ");
        c1.setQuantidadeLitros(ler.nextDouble());
        System.out.println("Digite o tipo de combustível: "
                + "\n1- Gasolina R$ 3,60"
                + "\n2- Álcool R$ 2,80"
                + "\n3- GNV R$ 1,60"
                + "\n4- Diesel R$ 3,60");
        c1.setTipoCombustivel(ler.nextInt());
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(c1);
        System.out.println("Valor total a pagar: "+c1.calcularPreco());
    }
}
