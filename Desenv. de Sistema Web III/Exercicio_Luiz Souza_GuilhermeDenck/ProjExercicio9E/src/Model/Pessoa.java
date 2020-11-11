
package Model;

/**
 *
 * @author Luiz and guidenck
 */
public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
               "\nPeso: " + peso +
               "\nAltura: " + altura;
    }
    
    public double calcularMassaMuscular(){
        return this.peso / (this.altura * this.altura);
    }
    
    public String pesoIdeal(){
        if(this.calcularMassaMuscular()>=18.5 && this.calcularMassaMuscular() <=24.9){
            return "Você está no peso ideal";
        }else{
                return "Você não está no peso ideal";
        }
    }      
}

