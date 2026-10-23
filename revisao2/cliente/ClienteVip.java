package revisao2.cliente;

public class ClienteVip extends Cliente{
    private double percentualDesconto;
    
    public ClienteVip(String nome, String cpf, String email, String endereco){
        super(nome, cpf, email, endereco);
        this.percentualDesconto = 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + " | VIP (10%)";
    }
}
