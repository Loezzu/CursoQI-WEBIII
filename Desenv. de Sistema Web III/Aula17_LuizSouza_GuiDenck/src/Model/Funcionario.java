package Model;

/**
 *
 * @author Luiz and GuiDenck
 */
public class Funcionario {
    //atributos:
    private String nome;
    private String cpf;
    private String cargo;
    private double valorHora;
    private double quantHoras;
    private double horasExtras50;
    private double horasExtras100;
    private byte dependentes;
    private byte tipoInsalubre;
    
    //Métodos:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(double quantHoras) {
        this.quantHoras = quantHoras;
    }

    public double getHorasExtras50() {
        return horasExtras50;
    }

    public void setHorasExtras50(double horasExtras50) {
        this.horasExtras50 = horasExtras50;
    }

    public double getHorasExtras100() {
        return horasExtras100;
    }

    public void setHorasExtras100(double horasExtras100) {
        this.horasExtras100 = horasExtras100;
    }

    public byte getDependentes() {
        return dependentes;
    }

    public void setDependentes(byte dependentes) {
        this.dependentes = dependentes;
    }

    public byte getTipoInsalubre() {
        return tipoInsalubre;
    }

    public void setTipoInsalubre(byte tipoInsalubre) {
        this.tipoInsalubre = tipoInsalubre;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nCargo: " + cargo +
                "\nValor por hora: " + valorHora +
                "\nQuantHoras: " + quantHoras +
                "\nHoras Extras 50: " + horasExtras50 +
                "\nHoras Extras 100: " + horasExtras100 +
                "\nDependentes: " + dependentes +
                "\nTipo de Insalubridade: " + tipoInsalubre;
    }
    
    public double calcularSalarioBruto(){
        return this.quantHoras * this.valorHora;
    }
    
      double valeTransporte;    
    public double calcularValeTransporte(double valorTransporteMensal){
        double passagem = this.calcularSalarioBruto() * 0.06;
        if(passagem <= valorTransporteMensal){
            valeTransporte = passagem;
            
        } else{
            valeTransporte = 0;
        }
   return valeTransporte;   
    }
    
    public double calcularSalarioFamilia(){
        double salarioBruto = this.calcularSalarioBruto();
        if(salarioBruto<=907.77){
            return dependentes * 46.54;
        }else if(salarioBruto>=907.78 && salarioBruto<=1364.43){
            return dependentes * 32.80;
        }else{
            return 0;
        }
    
    }
   
    public double calcularInsalubridade(){
        switch  (tipoInsalubre){
            case 1:
                return 997 * 0.40;
            case 2:
                return 997 * 0.20;
            case 3:
                return 997 * 0.10;
            default:
                return 0;
        }
    }
    
    public double calcularINSS(){
    double salarioBruto = this.calcularSalarioBruto();
    if(salarioBruto <= 1751.81){
        salarioBruto *= 0.08;
    } else if(salarioBruto <= 2919.72){
        salarioBruto *= 0.09;
    } else if(salarioBruto <= 5839.45){
        salarioBruto *= 0.11;
    } else{
        salarioBruto *= 0.27;
    }
    return salarioBruto;
    
    }
    
    double valeRefeicao;
    public double calcularValeRefeicao(double valorVale){
        valeRefeicao = (25 * valorVale) * 0.20;
        return valeRefeicao;
    } 
   
    public double calcularValorExtra50 (){
        return (valorHora * horasExtras50) * 1.5;
        
    }
    
    public double calcularValorExtra100 (){
        return (valorHora * horasExtras100) * 2;
    }    
    
    public double calcularTotalExtra(){
        return this.calcularValorExtra50() + this.calcularValorExtra100();
    }
    
    public double calcularBeneficio(){
        return calcularSalarioFamilia() + calcularTotalExtra() + calcularInsalubridade();
}

    public double calcularDesconto(){
        return valeTransporte + valeRefeicao + calcularINSS();
}
    
    public double calcularLiquido(){
       return this.calcularSalarioBruto() + this.calcularTotalExtra() - this.calcularDesconto();
   }


}
