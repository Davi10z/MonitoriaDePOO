package revisao.restaurante;
import java.util.ArrayList;

public class GestaoPedidos {
    private ArrayList<String> pedidos;

    public GestaoPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item){
        this.pedidos.add(item);
    }

    public String proximoPedido(){
        if(this.pedidos.isEmpty()){
            return "Lista vazia!";
        }
        else{
            return this.pedidos.remove(0);
        }
    }

    public int quantidadePendente(){
        return this.pedidos.size();
    }

    public void listarPedidos(){
        for(int i = 0; i < quantidadePendente(); i++){
            System.out.println(this.pedidos.get(i));
        }
    }
}
