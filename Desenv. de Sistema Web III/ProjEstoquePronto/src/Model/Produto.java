package Model;

/**
 *
 * @author Aline
 */
public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double valor;
    
    public Produto(){
        
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "\n---------------------"
                + "\nProduto: " + 
               "\nCódigo: " + codigo + 
               "\nNome: " + nome + 
               "\nQuantidade: " + quantidade + 
               "\nValor: " + valor;
    }   
    public double calcularTotal(){
        return this.valor * this.quantidade;
    }
}
