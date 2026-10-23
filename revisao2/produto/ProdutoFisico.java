package revisao2.produto;

public class ProdutoFisico extends Produto implements Entregavel {
    private double pesoKg;

    public ProdutoFisico(String nome, int codigo, double precoBase, int estoque, double pesoKg){
        super(nome, codigo, precoBase, estoque);
        this.pesoKg = pesoKg;
    }

    public double calcularPrecoFinal(){
        return this.precoBase += (this.precoBase*0.10);
    }


    public double calcularFrete(String cep){
        double frete = (2*pesoKg)+15;
        return frete;
    }
    public int prazoEntregaDias(String cep){
        if(cep.charAt(0) == '6'){
            return 7;
        }
        return 12;
    }

    public String exibirResumo() {
        return super.exibirResumo();
    }
}
