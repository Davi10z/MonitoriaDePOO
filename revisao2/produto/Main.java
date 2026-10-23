package revisao2.produto;

public class Main {
    public static void main(String[] args) {
        ProdutoDigital pd = new ProdutoDigital("FIFA 27", 106484, 279.90, 1, 100000);
        ProdutoFisico pf = new ProdutoFisico("Fonte Mancer 500w", 666, 249.90, 653, 1.250);
        Assinatura ass = new Assinatura("Pacote Office", 98654, 99.90, 1, 12);

        System.out.println(pd.exibirResumo());
        System.out.println(pf.exibirResumo());
        System.out.println(ass.exibirResumo());
    }
}
