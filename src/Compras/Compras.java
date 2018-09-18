
package Compras;

import Associoados.cadastroDeSocios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import socioavanti.planos.PlanoBronze;
import socioavanti.planos.Planos;

public class Compras implements IMaiorDeIdade {
    private int precoCerveja;
    private int precoRefrigerante;
    private int precoIngresso;
    private int quantidade;
    private int valorTotal;
    private int desconto;
    
    public Compras(){
        this.precoCerveja = 10;
        this.precoIngresso = 100;
        this.precoRefrigerante = 5;
    }
    
    private ArrayList <Compras> comprasEfetuadas = new ArrayList<>();


    public void comprarCerveja(){
        cadastroDeSocios busca = new cadastroDeSocios();
        Compras novo = new Compras();
        novo.setDesconto(busca.localizaSocio());
        novo.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada:")));                
        novo.setValorTotal(novo.getQuantidade() * novo.getPrecoCerveja() - novo.getDesconto());        
        comprasEfetuadas.add(novo);    
    }
    
    public void compraIngresso(){
        Compras novo = new Compras();
        cadastroDeSocios busca = new cadastroDeSocios();
        novo.setDesconto(busca.localizaSocio());
        novo.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada:")));                
        novo.setValorTotal(quantidade * novo.getPrecoIngresso());        
        comprasEfetuadas.add(novo);            
        }
    
    public void comprarRefrigerante(){
        Compras novo = new Compras();
        cadastroDeSocios busca = new cadastroDeSocios();
        novo.setDesconto(busca.localizaSocio());
        novo.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada:")));                
        novo.setValorTotal(quantidade * novo.getPrecoRefrigerante());        
        comprasEfetuadas.add(novo);    
        }
        
    public void exibirCompras(){
        for (Compras c : comprasEfetuadas)
        System.out.println(c);
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

    public ArrayList getComprasEfetuadas() {
        return comprasEfetuadas;
    }

    public void setComprasEfetuadas(ArrayList comprasEfetuadas) {
        this.comprasEfetuadas = comprasEfetuadas;
    }
    
    @Override
     public String toString() {
        return "Quantidade: "+quantidade+" Valor Unitario: "+getPrecoCerveja()+"Total:"+getValorTotal(); 
     }

    public int getPrecoCerveja() {
        return precoCerveja;
    }

    public void setPrecoCerveja(int precoCerveja) {
        this.precoCerveja = precoCerveja;
    }

    public int getPrecoRefrigerante() {
        return precoRefrigerante;
    }

    public void setPrecoRefrigerante(int precoRefrigerante) {
        this.precoRefrigerante = precoRefrigerante;
    }

    public int getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(int precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public void comprarCervejas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


