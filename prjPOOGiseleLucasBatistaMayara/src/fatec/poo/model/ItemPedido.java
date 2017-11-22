/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Mayara Betim Rodrigu
 */
public class ItemPedido  {
    private int numeroItem;
    private int qtdeVendida;
    private Pedido pedido;
    private Produto prod;
    
    
    public ItemPedido(int numeroItem, int qtdVendida){
        
        this.numeroItem = numeroItem;
        this.qtdeVendida = qtdVendida; 
    }
    
    public void setProduto(Produto p){
        prod = p;
        p.setQtdeDisponivel(p.getQtdeDisponivel()-qtdeVendida);
    }
    
    public int getQtdeVendida(){
        return qtdeVendida;
    }
    
    public void setQtdeVendida(int qtdeVendida){
        this.qtdeVendida = qtdeVendida;
        prod.setQtdeDisponivel(prod.getQtdeDisponivel()-qtdeVendida);
        
    }
    public double calcValorVenda(){
        return(qtdeVendida * prod.getPrecoUnit());
    }
    public int getNumeroItem(){
        return numeroItem;
    }
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

}
