package Model;

/**
 *
 * @author luiz and guidenck
 */
public class Produto {
    private String nomeProduto;
    private double valorProduto;
    private int quantidade;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  "Nome do produto: " + nomeProduto +
                "\nValor do produto: " + valorProduto +
                "\nQuantidade: " + quantidade;
        
    }
    public double valorTotal(){
        return this.quantidade * this.valorProduto;
        
    }
    
    
}
