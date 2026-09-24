// Tudo comentado onde tem erro (eu acho)!

public class Produto {
    public String nome;
    private static double preco;
    final int codigo;

    public Produto(String nome) {
        codigo = "A100"; // O atributo não é string e ta recebendo uma string? ERROR.
        nome = nome; // falta o this.nome no lugar do primeiro nome para ele saber o que é variaval e o que é parametro,
    }

    public static void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * (porcentagem / 100));
        System.out.println("Produto: " + nome); // Chamou nome no lugar do preco
    }

    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo; // O codigo é uma constante e não pode ser alterada, a não ser que você leve em conta que ele está vazio.
    }

    public void getPreco() { 
        return preco; // é void e ta dando return? Não pode, da erro
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado");
        p1.preco = 150.0;
        p1.codigo = 500; // O p1.codigo é uma constante e não pode ser alterada

        double valor = p1.getPreco(); // como que retorna se o get é void? não da certo
        System.out.println("Valor: " + valor);

        Produto.aplicarDesconto(10);
    }
}
