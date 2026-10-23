package revisao2.cliente;

public class Cliente extends Pessoa {
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String nome, String cpf, String email, String endereco){
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = 0;
    }

    public void adicionarPontos(int pontos){
        this.pontosFidelidade += pontos;
    }

    @Override
    public String toString() {
        return super.toString() + " | Pontos: " + pontosFidelidade;
    }
}
