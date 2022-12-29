package classes;

public class Produto {
    private String idProduto;
    private String descricao;
    private double preco;
    private int imposto;
    private String anotacao;

    public Produto(String idProduto, String descricao, double preco, int imposto, String anotacao) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.preco = (double) preco;
        this.imposto = imposto;
        this.anotacao = anotacao;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
    
     @Override
     public String toString(){
         return idProduto +"|"
                 + descricao +"|"
                 + preco +"|"
                 + imposto +"|"
                 + anotacao;
                 
     }
    
}
