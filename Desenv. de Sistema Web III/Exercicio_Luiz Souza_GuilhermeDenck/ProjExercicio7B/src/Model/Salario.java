package Model;

/**
 *
 * @author luiz and guidenck
 */
public class Salario {
    private String nomeFuncionario;
    private double valorHora;
    private double cargaHoraria;

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return  "NomeFuncionario: " + nomeFuncionario +
                "\nValor por hora: " + valorHora +
                "\nCarga Horária: " + cargaHoraria;
    }
    public double calcularSalarioMensal(){
        return this.cargaHoraria * this.valorHora;
    }
    
    
}
