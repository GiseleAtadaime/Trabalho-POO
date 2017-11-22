
package fatec.poo.model;

/**
 *
 * @author Mayara Betim Rodrigu
 */
public class Produto {
    private int codigo;
    private String descricao;
    private int qtdeDisponivel;
    private double precoUnit;
    private int estoqueMin;
    
    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getQtdeDisponivel(){
        return qtdeDisponivel;
    }
    
    public void setQtdeDisponivel(int qtddisponivel){
        this.qtdeDisponivel = qtddisponivel;
    }
    
    public double getPrecoUnit(){
        return precoUnit;
    }
    
    public void setPrecoUnit(double precounit){
        this.precoUnit = precounit;
    }
    
    public int getEstoqueMin(){
        return estoqueMin;
    }
    
    public void setEstoqueMin(int estqmin){
        this.estoqueMin = estqmin;
    } 
    public int getCodigo(){
        return codigo;
    }
    public String getDescricao(){
        return descricao;
    }
}
