package View;

import Model.Numero;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
       int numero;
       
        
        do{
         System.out.println("Digite um número maior que zero: ");
         numero = ler.nextInt();
         if(numero<1){
             System.out.println("ERRO!!! Você digitou um numero menor que 1");
         }
        }while(numero<1);
         
        Numero n1 = new Numero(numero);
        
        System.out.println("\n\nRespostas: ");
        
        int cont = 1; //Início: 
        while(cont<=5){ // condição
            System.out.println(n1);
            cont++; //incremento
        }
        System.out.println("A soma total é: "+n1.calcularSomatorio());
        System.out.println("O fatorial é: "+n1.calcuarFatorial());
        System.out.println("O total de pares: "+n1.contarPares());
        System.out.println("O total de Impares: "+n1.contarImpares());
    }
}
