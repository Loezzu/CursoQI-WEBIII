
package Model;

/**
 *
 * @author  Luiz and guidenck
 */
public class Programa {
    private String nomeProduto;
    private double valorProduto;
    private int quantidadeProduto;

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

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + nomeProduto + 
               "\nValor do Produto: " + valorProduto +
               "\nQuantidade de Produtos: " + quantidadeProduto;
    }
    
    public double valorTotal(){
        return this.valorProduto * this.quantidadeProduto;
    }
    public double valorComDesconto(){
        return this.valorTotal() - this.valorTotal() * 0.15;
    }
    public double valorComJuros(){
        return this.valorTotal() + this.valorTotal() * 0.20;
    }
}
