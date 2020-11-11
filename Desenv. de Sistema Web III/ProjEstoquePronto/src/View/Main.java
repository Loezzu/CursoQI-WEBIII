package View;



/**
 *
 * @author Aline
 */
import Model.Cadastro;
import Model.Produto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //instancia a classe que tem a Arraylist
        Cadastro c1 = new Cadastro();
        byte menu;
        do{
            System.out.println("1- Cadastrar Produto:\n" +
                                "2- Ver produtos Cadastros\n" +
                                "3- Ver quantidade de produtos Cadastrados\n" +
                                "4- Excluir Produto \n" +
                                "5- Ver valor total em estoque.\n" +
                                "0 - Sair");
            menu = ler.nextByte();
            switch(menu){
                case 1:
                    System.out.println("CADASTRANDO...");
                    Produto p1 = new Produto();
                    System.out.println("Digite o código do produto: ");
                    p1.setCodigo(ler.nextInt());
                    System.out.println("Digite o nome: ");
                    ler.nextLine();
                    p1.setNome(ler.nextLine());
                    System.out.println("Digite a quantidade: ");
                    p1.setQuantidade(ler.nextInt());
                    System.out.println("Digite o valor: ");
                    p1.setValor(ler.nextDouble());
                    //Colocando o produto no ArrayList
                    c1.cadastrar(p1);
                    System.out.println("Cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("VISUALIZANDO...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("não há produtos cadastrados.");
                        
                    }else{
                        System.out.println(c1);
                    }    
                    break;
                case 3:
                    System.out.println("QUANTIDADE...");
                    System.out.println(c1);
                    break;
                case 4:
                    System.out.println("EXCLUINDO...");
                    System.out.println("Digite o código do produto: ");
                    int codigo = ler.nextInt();
                    Produto encontrado = c1.pesquisarProduto(codigo);
                    if(encontrado==null){
                        System.out.println("Não foi encontrado produto com este código.");
                    }else{
                        System.out.println("Tem certeza que que deseja excluir?"
                                + "\n1-Sim"
                                + "\n2-Não");
                        byte op = ler.nextByte();
                        if(op==1){
                            c1.excluir(encontrado);
                            System.out.println("Removido com Sucesso.");
                        }else{
                            System.out.println("Opção cancelada.");
                        }                        
                    }
                    break;
                case 5:
                    System.out.println("VALOR TOTAL EM ESTOQUE...");
                    System.out.println(c1.calcularValorTotal());
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                   break;
                default:
                    System.out.println("Erro! Opção inválida");              
            }            
        }while(menu!=0);
    }    
}
