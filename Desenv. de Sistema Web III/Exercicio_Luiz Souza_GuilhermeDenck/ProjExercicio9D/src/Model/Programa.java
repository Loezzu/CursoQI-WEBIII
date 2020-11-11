package Model;

/**
 *
 * @author luiz and guidenck
 */
public class Programa {
    private int numero1;
    private int numero2;
    private int numero3;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    @Override
    public String toString() {
        return  "Numero 1: " + numero1 +
                "\nNumero 2: " + numero2 +
                "\nNumero 3: " + numero3;
    }
    public int maior(){
        if(this.numero1 > this.numero2 && this.numero1 > this.numero3){
            return this.numero1;
        } else if(this.numero2 > this.numero1 && this.numero2 > this.numero3){
            return this.numero2;
        } else{
            return this.numero3;
        }
    }
    
    public int menor(){
        if(this.numero1 < this.numero2 && this.numero1 < this.numero3){
            return this.numero1;
        } else if(this.numero2 < this.numero1 && this.numero2 < this.numero3){
            return this.numero2;
        } else{
            return this.numero3;
        }
   }
}
