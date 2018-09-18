
package Compras;


public class Produtos {
    
    private int precoIngresso;
    private String refrigerante;
    private int precoRefrigerante;
    private String cerveja;
    private int precoCerveja;
    private int quantidade;
    private int valorTotal;
    
    public Produtos(){       
        this.precoCerveja = 10;
        this.precoRefrigerante = 5;
        this.precoIngresso = 180;
        
    
    }

    public int getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(int precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public int getPrecoRefrigerante() {
        return precoRefrigerante;
    }

    public void setPrecoRefrigerante(int precoRefrigerante) {
        this.precoRefrigerante = precoRefrigerante;
    }

    public String getCerveja() {
        return cerveja;
    }

    public int getPrecoCerveja() {
        return precoCerveja;
    }

    public void setPrecoCerveja(int precoCerveja) {
        this.precoCerveja = precoCerveja;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

}
    