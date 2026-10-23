package revisao2.produto;

public class ProdutoDigital extends Produto {
    private int tamanhoMB;

    public ProdutoDigital(String nome, int codigo, double precoBase, int estoque, int tamanhoMB){
        super(nome, codigo, precoBase, estoque);
        this.tamanhoMB = tamanhoMB;
    }

    public double calcularPrecoFinal(){
        return precoBase - (precoBase*0.05);
    }

    public String exibirResumo(){
        return super.exibirResumo();
    }
}
