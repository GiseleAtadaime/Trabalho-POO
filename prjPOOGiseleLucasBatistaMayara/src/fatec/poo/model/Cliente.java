package fatec.poo.model;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos = new ArrayList();
    
    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = this.limiteCred;
    }
    public void setLimiteDisp(double deducao){
        limiteDisp = deducao;
    } 
    
    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    public void addPedido(Pedido ped){
        pedidos.add(ped);
        ped.setCliente(this);
    }
    public void listar(){
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("\nCPF: %s | nome: %s", cpf, nome);
        System.out.printf("\nEndereco: %s | Cidade: %s | Cep: %s | Uf: %s", getEndereco(),getCidade(), getCep(), getUf());
        System.out.printf("\nDDD: %s | Telefone: %s", getDdd(), getTelefone());
        System.out.printf("\nlimite de credito: %.2f | limite disponivel: %.2f",limiteCred, limiteDisp);
        for(int i = 0; i<pedidos.size();i++){
            pedidos.get(i).listar();
        }
    }
}
