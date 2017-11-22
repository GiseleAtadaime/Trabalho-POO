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
public class Pedido {
    private int Numero;
    private String dataEmissaoPedido, dataPagto;
    private boolean status;
    private ArrayList<ItemPedido> itemsPedidos;
    private Cliente cliente;
    private Vendedor vendedor;
    
    public Pedido(int Numero, String dataEmissaoPedido){
        this.Numero = Numero;
        this.dataEmissaoPedido = dataEmissaoPedido;
        itemsPedidos = new ArrayList<ItemPedido>();
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumero() {
        return Numero;
    }

    public String getDataEmissaoPedido() {
        return dataEmissaoPedido;
    }
    public void setCliente(Cliente c){
        cliente = c;
        
    }
    public void addItemsPedidos(ItemPedido item){
        itemsPedidos.add(item);
        item.setPedido(this);
        cliente.setLimiteDisp((cliente.getLimiteDisp()-item.calcValorVenda()));
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public void listar(){
        System.out.printf("\n\nPedido: %d                                 Data de emissao: %s\n", Numero, dataEmissaoPedido);
        System.out.printf("data de pagamento: %-10s                 status: %b\n", dataPagto, status);
        for(int i=0;i< itemsPedidos.size(); i++){
            System.out.println("\nItemPedido: " + itemsPedidos.get(i).getNumeroItem());
            System.out.println("Quantidade: " + itemsPedidos.get(i).getQtdeVendida());
            System.out.println("Valor: " + itemsPedidos.get(i).calcValorVenda());
        }
    }
}
