package revisao.restaurante;

public class Main {
    public static void main(String[] args) {
        GestaoPedidos sistema = new GestaoPedidos();

        sistema.adicionarPedido("Espetinho de gato");
        sistema.adicionarPedido("Batata frita");
        sistema.adicionarPedido("Lasanha");

        sistema.proximoPedido();

        System.out.println("Restam " + sistema.quantidadePendente() + " pedidos na lsita. Eles são:");
        sistema.listarPedidos();
    }
}
