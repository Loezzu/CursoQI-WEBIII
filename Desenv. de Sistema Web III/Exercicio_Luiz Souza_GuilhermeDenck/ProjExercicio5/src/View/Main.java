package View;

import Model.Calculadora;
import java.util.Scanner;

/**
 *
 * @author luiz and guidenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Calculadora c1 = new Calculadora();
        
        System.out.println("Digite o numero 1: ");
        c1.setNumero1(ler.nextDouble());
        System.out.println("Digite o numero 2: ");
        c1.setNumero2(ler.nextDouble());
        
        //pede o argumento:
        System.out.println("Digite o valor: ");
        double valor = ler.nextDouble();
        
        System.out.println("\n\nRESPOSTAS: ");
        System.out.println(c1);
        System.out.println("A soma dos numeros é: "+c1.somar());
        System.out.println("A multiplicação dos numeros é: "+c1.multiplicar());
        System.out.println("A subtração do numero 2 é: "+c1.subtrair1Do2());
        System.out.println("A subtração do numero 1 é: "+c1.subtrair2Do1());
        System.out.println("A raíz quadrada do numero 1 é: "+c1.calcularRaizQuadradaDo1());
        System.out.println("A raíz quadrada do numero 2 é: "+c1.calcularRaizQuadradaDo2());
        System.out.println("O numero 1 ao quadrado é: "+c1.calcular1AoQuadrado());
        System.out.println("A soma de um valor ao numero 1 é: "+c1.somarUmValorAo1(valor));
        System.out.println("A soma de um valor ao numero 2 é: "+c1.somarUmValorAo2(valor));
               
    }
}
