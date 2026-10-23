package revisao2.produto;

public class PagamentoBoleto implements Pagamento{
    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }

    @Override
    public String getDescricao() {
        return "boleto";
    }
}
