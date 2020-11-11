package Model;



/**
 *
 * @author Aline
 */
import java.util.ArrayList;
public class Cadastro {
    private ArrayList<Produto> lista;
    
    public Cadastro(){
        this.lista = new ArrayList<>();        
    }
    public ArrayList<Produto> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }
    @Override
    public String toString() {
        return "Lista de Produtos: \n" + lista;
    }
    //Método cadastrar:
    public void cadastrar(Produto p1){
        this.lista.add(p1);
    }
    public void excluir(Produto p1){
        this.lista.remove(p1);
    }
    public int verQuantidade(){
        return this.lista.size();
    }
    public double calcularValorTotal(){
        double acum = 0;
        for(int i=0; i<this.lista.size(); i++){
            acum = acum + this.lista.get(i).calcularTotal();
        }
       return acum;
    }
    public Produto pesquisarProduto(int codigo){
        Produto achei = null;
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getCodigo()==codigo){
                achei = this.lista.get(i);
            }
        }
        return achei;
    }
}
