/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Luiz and guidenck
 */
public class Combustivel {
    private double quantidadeLitros;
    private int tipoCombustivel;

    public double getQuantidadeLitros() {
        return quantidadeLitros;
    }

    public void setQuantidadeLitros(double quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return  "Quantidade de litros; " + quantidadeLitros +
                "\nTipo de Combustivel: " + tipoCombustivel;
    }
    public double calcularPreco(){
        switch (this.tipoCombustivel) {
            case 1:
                //gasolina
                return this.quantidadeLitros * 3.60;
            case 2:
                //alccol
                return this.quantidadeLitros * 2.80;
            case 3:
                //GNV
                return this.quantidadeLitros * 1.60;
            case 4:
                //diesel
                return this.quantidadeLitros * 3.60;
            default:
                return 0;
        }
    }
}   

