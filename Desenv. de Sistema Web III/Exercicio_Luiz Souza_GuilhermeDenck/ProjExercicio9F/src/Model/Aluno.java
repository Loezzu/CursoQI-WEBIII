
package Model;

/**
 *
 * @author Luiz and guidenck
 */
public class Aluno {
    private String nomeAluno;
    private double nota1;
    private double nota2;
    private int faltas;
    private int totalAulas; 

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas) {
        this.totalAulas = totalAulas;
    }

    @Override
    public String toString() {
        return "Nome Aluno: " + nomeAluno +
               "\nNota 1: " + nota1 + 
               "\nNota 2: " + nota2 +
               "\nFaltas: " + faltas +
               "\nTotal de Aulas: ";
    }
     public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
     }
    public int calcularFrequencia() {
         return (this.totalAulas - this.faltas) * 100 / this.totalAulas;
    }
    
    
    public String calcularResultadoFinal() {
      if(this.calcularMedia() < 2.0 ){ //reprovado por nota
          return "Reprovado por Nota";
      }else if (this.calcularMedia() >= 2.0 && this.calcularMedia() <= 5.9 && this.calcularFrequencia() < 75){ //Reprovado por faltas
          return "Reprovado por Faltas";
      }else if (this.calcularMedia() >= 2.0 && this.calcularMedia() <= 5.9 && this.calcularFrequencia() >= 75){ //Recuperação
          return "Recuperação";
      }else if (this.calcularMedia() >= 6.0  && this.calcularFrequencia() < 75){ //Reprovado por Falta
          return "Reprovado por Falta";
      }else if (this.calcularMedia() >= 8.0  && this.calcularFrequencia() >= 80){ // Aprovado com Láurea
          return "Aprovado com Láurea";
      }else if (this.calcularMedia() >= 6.0 && this.calcularFrequencia() >= 75){ //Aprovado
          return "Aprovado";
      }else{
          return "Inválido";
      }
   }
}     
