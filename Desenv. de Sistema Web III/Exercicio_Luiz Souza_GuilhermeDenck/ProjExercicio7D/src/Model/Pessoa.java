package Model;

/**
 *
 * @author luiz and guidenck
 */
public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private int corDosOlhos;
    private int corDosCabelos;
    private int sexo;

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

    public int getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(int corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public int getCorDosCabelos() {
        return corDosCabelos;
    }

    public void setCorDosCabelos(int corDosCabelos) {
        this.corDosCabelos = corDosCabelos;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        String textoCorOlho;
        if(this.corDosOlhos == 1) {
            textoCorOlho = "Azul";
          
        }else if(this.corDosOlhos == 2){
            textoCorOlho = "Verde";
            
        }else if(this.corDosOlhos == 3){
            textoCorOlho = "Castanho Claro";
        }else if(this.corDosOlhos == 4){
            textoCorOlho = "Castanho escuro";
        }else{
            textoCorOlho = "INVÁLIDO";
        }
        String textoCorCabelo;
        if(this.corDosCabelos == 1){
            textoCorCabelo = "Castanho Escuro";
                      
        }else if(this.corDosCabelos == 2){
            textoCorCabelo = "Castanho Claro";
            
        }else if(this.corDosCabelos == 3){
            textoCorCabelo = "Loiro";
            
        }else if(this.corDosCabelos == 4){
            textoCorCabelo = "Ruivo";
            
        }else if (this.corDosCabelos == 5){
            textoCorCabelo = "Preto";
            
        }else{
            textoCorCabelo = "INVÁLIDO";
        }
        
        String textoSexo;
        if(this.sexo == 1){
            textoSexo = "Masculino";
            
        }else if(this.sexo == 2){
            textoSexo = "Feminino";
        }else{
            textoSexo = "INVÁLIDO";
        }
        
        return  "Nome: " + nome +
                "\nPeso: " + peso +
                "\nAltura: " + altura +
                "\nCor Dos Olhos: " + corDosOlhos + " = " + textoCorOlho +
                "\nCor Dos Cabelos: " + corDosCabelos + " = " + textoCorCabelo + 
                "\nSexo: " + sexo + " = " + textoSexo;
    }
}
       