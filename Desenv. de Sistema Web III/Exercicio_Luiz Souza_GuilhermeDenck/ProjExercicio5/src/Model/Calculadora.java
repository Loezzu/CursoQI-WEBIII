package Model;

/**
 *
 * @author luiz and guidenck
 */
public class Calculadora {
    //atributos:
    private double numero1;
    private double numero2;
    //métodos:

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return  "Numero1: " + numero1 +
                "\nNumero2: " + numero2;
    }
    
    public double somar(){
        return this.numero1 + this.numero2;
        
    }
    public double multiplicar(){
        return this.numero1 * this.numero2;
        
    }
    public double subtrair1Do2(){
        return this.numero2 - this.numero1;
        
    }
   public double subtrair2Do1(){ 
      return this.numero1 - this.numero2;
      
   }
   public double calcularRaizQuadradaDo1(){
       return Math.sqrt(this.numero1);
   }
   public double calcularRaizQuadradaDo2(){
       return Math.sqrt(this.numero2);
   }
   public double calcular1AoQuadrado(){
       return Math.pow(this.numero1,2);
   }
   public double somarUmValorAo1(double valor){
       return this.numero1 + valor;
       
   }
   public double somarUmValorAo2(double valor){
       return this.numero2 + valor;
   }
}
