
package Model;

/**
 *
 * @author luiz and guidenck
 */
public class Calculo {
    private String nomeDoAluno;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
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

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    @Override
    public String toString() {
        return  "Nome Do Aluno: " + nomeDoAluno +
                "\nNota 1: " + nota1 +
                "\nNota 2: " + nota2 +
                "\nNota 3: " + nota3 +
                "\nNota 4: " + nota4;
        
    }
    public double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
    }
    
    
}
