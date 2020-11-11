package View;

import Model.Cadastro;
import Model.Contato;
import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //instancia a classe que tem a Arraylist:
        Cadastro c1 = new Cadastro();
        byte menu;
        do{
            System.out.println("1- Cadastre contato\n" +
                               "2- Ver contatos\n" +
                               "3- Ver Quantidade de Contatos cadastrados\n" +
                               "4- Remover um contato\n" +
                               "5- Pesquisar Contato pelo telefone celular\n" +
                               "0- Sair");
            menu = ler.nextByte();
            switch(menu){
                case 1:
                    System.out.println("CADASTRANDO...");
                    Contato c2 = new Contato();
                    System.out.println("Digite o codigo: ");
                    c2.setCodigo(ler.nextInt());
                    System.out.println("Digite o nome para o contato: ");
                    c2.setNome(ler.next());
                    System.out.println("Digite o telefone celular: ");
                    c2.setTelefoneCelular(ler.nextLong());
                    System.out.println("Digite o telefone residencial: ");
                    c2.setTelefoneResidencial(ler.nextLong());
                    System.out.println("Digite o E-mail: ");
                    c2.setEmail(ler.next());
                    //Colocando o produto no ArrayList
                    c1.cadastrar(c2);
                    System.out.println("Cadastrado com sucesso !!!");
                    
                    break;
                    
                case 2:
                    System.out.println("VISUALIZANDO...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há contatos cadastrados.");
                        
                    }else{
                        System.out.println(c1);
                        
                    }
                    break;
                    
                case 3:
                    System.out.println("Quantidade de produtos cadastrados...");
                    System.out.println(c1.verQuantidade());
                    break;
                    
                case 4:
                    System.out.println("EXCLUINDO...");
                    System.out.println("Digite o código do contato: ");
                    int codigo = ler.nextInt();
                    Contato encontrado = c1.pesquisarContato(codigo);
                    if(encontrado == null){
                        System.out.println("Não foi encontrado contato com este código.");
                        
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
                    System.out.println("Pesquisando....");
                    System.out.println("Digite o Telefone Celular: ");
                    long telefoneCelular = ler.nextLong();
                    System.out.println(c1.pesquisarContatoPeloCel(telefoneCelular));
                    
                    break;
                case 0:
                    System.out.println("Volte Sempre !!");
                    break;
   
                default:   
                    System.out.println("ERRO !! Opção inválida");
            }
            
            
        }while(menu!=0);
        
    }
}
