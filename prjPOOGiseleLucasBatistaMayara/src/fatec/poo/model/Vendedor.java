/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;



/**
 *
 * @author Tamie
 */
public class Vendedor extends Pessoa{
    private double salarioBase, comissao; //comissao em %;
    private ArrayList<Pedido> pedidos;
    
    public Vendedor(String nome, String cpf ,double salarioBase){
        super(cpf,nome);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<Pedido>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setVendedor(this);  
    }  
    public void listar(){
        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("\n\tVendedor");
        System.out.printf("\nCPF: %s | nome: %s", cpf, nome);
        System.out.printf("\nEndereco: %s | Cidade: %s | Cep: %s | Uf: %s", getEndereco(),getCidade(), getCep(), getUf());
        System.out.printf("\nDDD: %s | Telefone: %s", getDdd(), getTelefone());
        System.out.printf("\nSalario base: %.2f | comissao: %.1f\n",salarioBase, comissao);
        for(int i =0; i<pedidos.size(); i++){
            pedidos.get(i).listar();
        }
    }
}
