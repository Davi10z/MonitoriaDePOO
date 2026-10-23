package revisao2.cliente;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String email;

    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf;
    }
}
