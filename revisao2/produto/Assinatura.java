package revisao2.produto;

public class Assinatura extends Produto{
    private int meses;

    public Assinatura(String nome, int codigo, double precoBase, int estoque, int meses){
        super(nome, codigo, precoBase, estoque);
        this.meses = meses;
    }

    public double calcularPrecoFinal(){
        if(meses >= 6){
            return (precoBase * meses) - ((precoBase*meses)*0.10);
        }
        return precoBase * meses;
    }
}
