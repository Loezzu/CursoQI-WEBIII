package Model;

/**
 *
 * @author Luiz
 */
public class Pessoa {
   //Atributos:
    private double altura;
    private byte sexo;
    //Métodos:
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public byte getSexo() {
        return sexo;
    }
    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }
    @Override
    public String toString() {
        String textoSexo;
        if(this.sexo==1){
            textoSexo = "Feminino";
        }else if(this.sexo==2){
            textoSexo = "Masculino";
        }else{
            textoSexo = "Inválido";
        }
        return "Altura: " + altura + 
               "\nSexo: " + sexo + " = "+textoSexo;
    }
    public double calcularPesoIdeal(){
        if(this.sexo==1){ //Feminino
            return (62.1 * this.altura) - 44.7;
        }else if(this.sexo==2){
            return (72.7 * this.altura) - 58;
        }else{
            return 0;
        }
    }
     
}
