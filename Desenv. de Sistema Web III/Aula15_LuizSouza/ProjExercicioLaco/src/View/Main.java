package View;

import Model.Numero;
import java.util.Scanner;

/**
 *
 * @author Luiz
 */
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
        
        byte menu;
        do{
            System.out.println("ESCOLHA"
                    + "\n1- Ver Numero Digitado"
                    + "\n2- Editar numero"
                    + "\n3- Ver somatorio do n"
                    + "\n4- ver fatorial do n"
                    + "\n5- contar pares"
                    + "\n0- sair");
            menu=ler.nextByte();
            switch(menu){
                case 1:
                    System.out.println("--VIZUALIZANDO--");
                    System.out.println(n1);
                    break;
                case 2:
                    System.out.println("--EDITANDO--");
                    do{
                        System.out.println("Digite um novo numero: ");
                        n1.setNumero(ler.nextInt());
                        if(n1.getNumero()<1){
                            System.out.println("ERRO!");
                            
                        }
                    }while(n1.getNumero()<1);
                    System.out.println("Editado com SUCESSO!");
                    break;
                case 3:
                    System.out.println("--SOMATORIO--");
                    System.out.println(n1.calcularSomatorio());
                    break;
                case 4:
                    System.out.println("--FATORIAL--");
                    System.out.println(n1.calcuarFatorial());
                    break;
                case 5:
                    System.out.println("--CONTAR PARES--");
                    System.out.println(n1.contarPares());
                    break;
                case 0:
                    System.out.println("--Obrigada, Volte sempre!");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        }while(menu!=0);
        
        
        System.out.println("\n\nRespostas: ");
        
        
    }
}
