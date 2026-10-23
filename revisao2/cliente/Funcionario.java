package revisao2.cliente;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario(String nome, String cpf, String email, int matricula, double salario){
        super(nome, cpf, email);
        this.matricula = matricula;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " | Salário: " + salario;
    }
}
