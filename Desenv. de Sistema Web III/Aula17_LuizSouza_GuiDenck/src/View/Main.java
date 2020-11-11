package View;

import Model.Funcionario;
import java.util.Scanner;

/**
 *
 * @author Luiz and GuiDenck
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario();
        
        byte menu;
        do{
            System.out.println("Digite: \n1 - Cadastrar dados             2 - Ver Dados Cadastrados"
                              + "\n3 - Ver Sálario Bruto                  4 - Ver Sálario Família"
                              + "\n5 - Ver Valor do Vale Transporte       6 - Ver Insalubridade"
                              + "\n7 - Ver INSS                           8 - Ver Vale Refeição"
                              + "\n9 - Ver Total Horas Extras             10 - Ver Sálario Final"
                              + "\n                         0 - Sair");
           menu = ler.nextByte(); 
            switch(menu){
                case 1:
                    byte voltar1 = 2;
                    do{
                        System.out.println("Digite seu nome:");
                        f1.setNome(ler.next());
                        System.out.println("Digite seu CPF:");
                        f1.setCpf(ler.next());
                        System.out.println("Digite seu cargo:");
                        f1.setCargo(ler.next());
                        System.out.println("Digite o total ganho por hora:");
                        f1.setValorHora(ler.nextDouble());
                        System.out.println("Digite o total de horas trabalhadas:");
                        f1.setQuantHoras(ler.nextDouble());
                        System.out.println("Digite as horas extras em dias úteis:");
                        f1.setHorasExtras50(ler.nextDouble());
                        System.out.println("Digite as horas extras em feriados:");
                        f1.setHorasExtras100(ler.nextDouble());
                        System.out.println("Digite quantos dependentes você tem:");
                        f1.setDependentes(ler.nextByte());
                        System.out.println("Digite o tipo de insalubridade: \n1 - 40% Grau Máximo \n2 - 20% Grau Médio \n3 - 10% Grau Mínimo \n4 - Sem Insalubridade");
                        f1.setTipoInsalubre(ler.nextByte());
                        System.out.println("******************************");
                        System.out.println("Dados cadastrados com sucesso!");
                        System.out.println("******************************");
                        System.out.println("Voltar? \n1 - Sim, vamos lá!       2 - Não, quero refazer!");
                        voltar1 = ler.nextByte();
                    }while(voltar1 == 2);
                        break;
                        
                case 2:
                    System.out.println(f1);
                    break;
                    
                case 3: 
                    System.out.println("Seu salário bruto é: "+f1.calcularSalarioBruto());
                    break;
                    
                case 4:
                    System.out.println("Salário Familia: "+f1.calcularSalarioFamilia());
                    break;
                   
                case 5:
                    System.out.println("Digite o total de gasto com vale transporte mensalmente: ");
                    double valorTransporteMensal = ler.nextDouble();
                    System.out.println("Valor do vale transporte: "+f1.calcularValeTransporte(valorTransporteMensal));
                    break;
                    
                case 6: 
                    System.out.println("A sua insalubridade é de: "+f1.calcularInsalubridade());
                    break;
                case 7:
                    System.out.println("O total do INSS é: "+f1.calcularINSS());
                    break;
                case 8:
                    System.out.println("Digite o valor do vale refeição: ");
                    double valorVale = ler.nextDouble();
                    System.out.println("Vale refeição: "+f1.calcularValeRefeicao(valorVale));
                    break;
                    
                case 9:
                    System.out.println("Total de horas extras: "+f1.calcularTotalExtra());
                    break;
                
                case 10:
                    System.out.println("Salario Final: "+f1.calcularLiquido());
                    break;
                    
                case 0:
                    System.out.println("Saindo... ");
                    break;
                    
                default:
                    System.out.println("Numero invalido!");
            }      
        }while(menu!=0);
        
    }
}
