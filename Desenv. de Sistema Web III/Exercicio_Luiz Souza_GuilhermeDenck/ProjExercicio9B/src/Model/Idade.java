package Model;

/**
 *
 * @author luiz and guidenck
 */
public class Idade {
    private int anoNascimento;
    private int anoAtual;

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    @Override
    public String toString() {
        return  "Ano de Nascimento: " + anoNascimento +
                "\nAno atual: " + anoAtual;
        
    }
    public int calcularidadeAnos(){
        return this.anoAtual - this.anoNascimento;
        
    }
    public int calcularIdadeMeses(){
        return this.calcularidadeAnos() * 12;
        
    }
    public int calcularIdadeDias(){
        return this.calcularidadeAnos() * 365;
        
    }
    public int calcularIdadeSemanas(){
        return this.calcularidadeAnos() * 52;
        
    }
    public int calcularIdadeHoras(){
        return this.calcularidadeAnos() * 8760;
        
    }
    public int calcularIdadeMinutos(){
        return this.calcularidadeAnos() * 525600;
        
    }
    public int calcularIdadeSegundos(){
        return this.calcularidadeAnos() * 31536000;
    }
}
