package View;

import Model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Luiz Souza, Guilherme Denck e Rafael Santini
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        byte resposta=0;
        
        
        
        
        String user = "admin";
        int password = 12345;
        String usuario;
        int senha;
        
        
        
        do{
            System.out.println("Digite o nome do usuário: ");
            usuario = ler.next();
            System.out.println("Digite a senha: ");
            senha = ler.nextInt();
            if(!(usuario.equals(user)) || senha!=password){
                System.out.println("SENHA OU USUÁRIO INVÁLIDO.");
            }
        }while(!(usuario.equals(user)) || senha!=password); 
        
        Aluno a1 = new Aluno();
        
        System.out.println("Digite o nome do aluno: ");
        a1.setNome(ler.next());
        System.out.println("Digite seu RA: ");
        a1.setRa(ler.next());
        
        
        
        
        byte contErros = 0;
        byte contAcertos = 0;
        //Questão 1
        System.out.println("Questão 1:"
                + "\nA linguagem Java foi, originalmente, desenvolvida para:  "
                + "\n1) permitir a comunicação entre aparelhos domésticos e computadores"
                + "\n2) traduzir fórmulas matemáticas utilizando-se cartões perfurados"
                + "\n3) processar valores inteiros, em um ambiente negócios, em computadores de grande porte;"
                + "\n4) demonstrar a viabilidade da implementação da álgebra relacional de dados");
        resposta = ler.nextByte();
        a1.cadastrarResposta(0, resposta); 
        if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        //Questão 2:
        System.out.println("Questão 2:"
                + "\nNa linguagem Java, são modificadores para controle de acesso às variáveis e aos métodos de uma classe:  "
                + "\n1) public e private."
                + "\n2) private e static."
                + "\n3) static e public."
                + "\n4) final e static.");
        resposta = ler.nextByte();
        a1.cadastrarResposta(1, resposta); 
        if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        //Questão 3:
        System.out.println("Questão 3:"
                + "\nCom relação aos tipos de dados suportados pelo Java, qual das alternativas a seguir está correta?  "
                + "\n1)byte armazena números inteiros de 8 bits, long armazena números inteiros de 64 bits e char armazena caracteres em notação Unicode de 16 bits."
                + "\n2)char armazena caracteres de 64 bits, int armazena números inteiros de 32 bits e float armazena números em notação de ponto flutuante de 32 bits."
                + "\n3)byte armazena números inteiros de 8 bits, int armazena números inteiros de 32 bits e short armazena números inteiros de 64 bits."
                + "\n4)byte armazena números inteiros de 8 bits, long armazena números inteiros de 64 bits e char armazena caracteres em notação Unicode de 32 bits.");
        resposta = ler.nextByte();
        a1.cadastrarResposta(2, resposta); 
        if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        
        //Questão 4:
        System.out.println("Questão 4:"
                + "\nSobre a linguagem de programação Java, é INCORRETO afirmar que:  "
                + "\n1)é fracamente tipada."
                + "\n2)tem suporte aos principais conceitos de orientação a objetos."
                + "\n3)não tem suporte à herança múltipla."
                + "\n4)tem suporte a aplicações concorrentes.");
        resposta = ler.nextByte();
        a1.cadastrarResposta(3, resposta); 
        if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        
        
        //Questão 5:
        System.out.println("Questão 5:"
                + "\nEm Java, o modificador public presente na declaração de uma classe:  "
                + "\n1)torna a classe visível e acessível a qualquer outra classe da aplicação, mesmo àquelas declaradas em outros pacotes;"
                + "\n2)torna a classe visível e acessível a outras classes da aplicação, desde que declaradas no mesmo pacote;"
                + "\n3)estende-se a todos os membros da classe (atributos e métodos), tornando-os, juntamente com a classe, também visíveis e acessíveis a qualquer outra classe da aplicação, mesmo aquelas declaradas em outros pacotes;"
                + "\n4)estende-se a todos os membros da classe (atributos e métodos), tornando-os, juntamente com a classe, também visíveis e acessíveis a outras classes da aplicação, desde que declaradas no mesmo pacote;");
        resposta = ler.nextByte();
        a1.cadastrarResposta(4, resposta); 
        if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        
        
        //Questão 6:
        System.out.println("Questão 6:"
                + "\nAssinale a alternativa que indica como deve ser definida a visibilidade de um atributo em Java, de modo a que ele seja acessível somente aos métodos da própria classe:  "
                + "\n1)private."
                + "\n2)static."
                + "\n3)protected"
                + "\n4)public.");
        resposta = ler.nextByte();
        a1.cadastrarResposta(5, resposta); 
        if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        
        //Questão 7:
        System.out.println("Questão 7:"
                + "\nO comando break tem a função de:  "
                + "\n1)interromper a execução de um loop."
                + "\n2)condicionar a execução de um comando de atribuição a um operador lógico."
                + "\n3)segmentar a execução de um loop em duas ou mais partes aninhadas."
                + "\n4)estabelecer um intervalo de depuração durante a execução de um loop.");
        resposta = ler.nextByte();
        a1.cadastrarResposta(6, resposta); 
        if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        
        //Questão 8:
        System.out.println("Questão 8:"
                + "\nNa linguagem Java, os tipos primitivos são:  "
                + "\n1)char, boolean, byte, short, int, long, float e double."
                + "\n2)char, bool, int, byte, short, uint, long, float e double."
                + "\n3)char, integer, double e float."
                + "\n4)char, int, longint, float e double.");
        resposta = ler.nextByte();
        a1.cadastrarResposta(7, resposta); 
        if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        
        //Questão 9:
        System.out.println("Questão 9:"
                + "\nO método construtor é um tipo especial de rotina que toda classe possui. É uma característica de todo método construtor na linguagem Java:  "
                + "\n1)obrigatoriedade de sua declaração."
                + "\n2)desnecessária alocação de memória para sua execução."
                + "\n3)atribuição de nome diferente da classe a que pertence."
                + "\n4)ausência de especificação de tipo de retorno.");
        resposta = ler.nextByte();
        a1.cadastrarResposta(8, resposta); 
        if (resposta == 4) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
        
        
        //Questão 10:
        System.out.println("Questão 10:"
                + "\nqual o limite do byte:  "
                + "\n1)127."
                + "\n2)245."
                + "\n3)654."
                + "\n4)495.");
        resposta = ler.nextByte();
        a1.cadastrarResposta(9, resposta); 
       if (resposta == 1) { 
            contAcertos++;
        } else {
            contErros++;
        }
        
       
        System.out.println("Nome: " +a1.getNome() +
                           "\nRA: "  +a1.getRa());
        System.out.println("Você acertou: " + contAcertos + " Você errou: "  + contErros);
        System.out.println(a1.verGabarito());
        System.out.println(a1.verResultado(contAcertos));
         
    }
    
}
