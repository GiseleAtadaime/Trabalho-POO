
import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tamie
 */
public class Aplic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Vendedor vendedor1 = new Vendedor("Affonso Pereira", "3482948293", 1350);
        vendedor1.setComissao(20);
        vendedor1.setCidade("Sorocaba");
        vendedor1.setCep("18085-240");
        vendedor1.setDdd("15");
        vendedor1.setEndereco("centro");
        vendedor1.setTelefone("3288-2345");
        vendedor1.setUf("SP");
        
        Cliente cliente1 = new Cliente("1233445454", "Rodrigo Rodrigues", 5000);
        cliente1.setCidade("Sorocaba");
        cliente1.setCep("18085-240");
        cliente1.setDdd("15");
        cliente1.setEndereco("Jardim Saira");
        cliente1.setTelefone("3288-9343");
        cliente1.setUf("SP");
        
        Cliente cliente2 = new Cliente("5483993283", "Pedro Rocha", 11200);
        cliente2.setCidade("Piedade");
        cliente2.setCep("18170-000");
        cliente2.setDdd("15");
        cliente2.setEndereco("Centro");
        cliente2.setTelefone("3299-7765");
        cliente2.setUf("SP");
        
        //Produtos
        Produto prod1 = new Produto(21, "Canetas Bic");
        prod1.setEstoqueMin(100);
        prod1.setQtdeDisponivel(1000);
        prod1.setPrecoUnit(2.75);
                
        Produto prod2 = new Produto(22, "Sulfite A4 500folhas");
        prod2.setEstoqueMin(200);
        prod2.setQtdeDisponivel(2500);
        prod2.setPrecoUnit(11.50);
        
        //Pedido1
        Pedido pedido1 = new Pedido(33, "10/10/2017");
        pedido1.setDataPagto("12/10/2017");
        pedido1.setStatus(true);
        
        ItemPedido itemp1 = new ItemPedido(1,100);
        itemp1.setProduto(prod1);
        ItemPedido itemp2 = new ItemPedido(2,200);
        itemp2.setProduto(prod2);

        vendedor1.addPedido(pedido1);
        cliente1.addPedido(pedido1);
        pedido1.addItemsPedidos(itemp1);
        pedido1.addItemsPedidos(itemp2);
        
        
        //Pedido2
        Pedido pedido2 = new Pedido(23, "07/11/2017");
        pedido2.setDataPagto("-");
        pedido2.setStatus(false);
        
        cliente2.addPedido(pedido2);
        vendedor1.addPedido(pedido2);
        
        itemp1.setQtdeVendida(250);
        pedido2.addItemsPedidos(itemp1);
        itemp2.setQtdeVendida(300);
        pedido2.addItemsPedidos(itemp2);
        
        
        
        cliente1.listar();
        cliente2.listar();
        vendedor1.listar();
        
        
        
        
        
    }
    
}
