
package Model;

/**
 *
 * @author Luiz
 */
public class Categoria {
    //atributos:
    private String nome;
    private int idade;
    //métodos:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nIdade: " + idade;
        
    }
    
    public String classificar() {
        if (this.idade < 8 || this.idade > 70) {
            return "ERRO! Não pode ser nadador!";
        } else if (this.idade >= 8 && this.idade <= 10) {
            return "CATEGORIA: Infantil";
        } else if (this.idade >= 11 && this.idade <= 12) {
            return "CATEGORIA: Pré-Adolescente";
        } else if (this.idade >= 13 && this.idade <= 17) {
            return "CATEGORIA: Adolescente";
        } else if (this.idade >= 18 && this.idade <= 60) {
            return "CATEGORIA: Adulto";
        } else {
            return "CATEGORIA: Idoso";
        }
    }
    
}
