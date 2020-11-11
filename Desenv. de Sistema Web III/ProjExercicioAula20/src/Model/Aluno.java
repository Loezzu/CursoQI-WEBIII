package Model;

import java.util.Arrays;

/**
 *
 * @author Luiz Souza, Guilherme Denck e Rafael Santini
 */
public class Aluno {
    private String nome;
   private String ra;
   private String senha;
   private byte[] resposta;

    public Aluno() {
        this.resposta = new byte[10];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public byte[] getResposta() {
        return resposta;
    }

    public void setResposta(byte[] resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nRA: " + ra +
                "\nSenha=" + senha +
                "\nResposta: " + Arrays.toString(resposta);
    }
    
    public void cadastrarResposta(int i,byte resposta){
        this.resposta[i]=resposta;
    }
    public String verGabarito(){
        return "\nQuestão 1  = Alternativa 1"+
               "\nQuestão 2  = Alternativa 1"+
               "\nQuestão 3  = Alternativa 1"+
               "\nQuestão 4  = Alternativa 1"+
               "\nQuestão 5  = Alternativa 1"+
               "\nQuestão 6  = Alternativa 1"+
               "\nQuestão 7  = Alternativa 1"+
               "\nQuestão 8  = Alternativa 1"+
               "\nQuestão 9  = Alternativa 4"+
               "\nQuestão 10 = Alternativa 1\n";
    }
  
    public String verResultado(int contAcertos){
        if(contAcertos <= 1){
             return "\nVocê foi Reprovado";
        }else if(contAcertos <= 5 ){
             return "\nVocê está em Recuperação";
        }else if(contAcertos <= 9 ){
             return "\nVocê foi Aprovado";
        }else {
             return "\nVocê foi Aprovado com Laurea Acadêmica";
        }
    }

}
