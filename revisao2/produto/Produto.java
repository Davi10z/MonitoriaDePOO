package revisao2.produto;

public abstract class Produto {
    protected int codigo;
    protected String nome;
    protected double precoBase;
    protected int estoque;

    public Produto(String nome, int codigo, double precoBase, int estoque){
        this.nome = nome;
        this.codigo = codigo;
        this.precoBase = precoBase;
        this.estoque = estoque;
    }

    public abstract double calcularPrecoFinal();
    public String exibirResumo(){
        return String.format(codigo + " | " + nome + " | R$: %.2f", calcularPrecoFinal());
    }
    public void baixarEstoque(int quantidade){
        if(quantidade <= this.estoque){
            this.estoque -= quantidade;
        }
        else{
            System.out.println("Estoque insuficiente.");
        }
    }

}
