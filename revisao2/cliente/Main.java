package revisao2.cliente;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Ana", "111.111.111-11", "ana@mail.com", "Rua A");
        ClienteVip v = new ClienteVip("Joana", "999.999.999-99", "joana@mail.com", "Centro");
        Funcionario f = new Funcionario("Geciara", "986.954.693-63", "ts", 961453, 6955555);

        System.out.println(c);
        System.out.println(v);
        System.out.println(f);
    }
}
