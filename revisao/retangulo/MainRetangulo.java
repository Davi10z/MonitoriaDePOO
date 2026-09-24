package revisao.retangulo;

public class MainRetangulo {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(5,5);
        System.out.println("A area do retangulo é " + retangulo.calculaArea() + "m²");
        if(retangulo.isQuadrado()){
            System.out.println("Esse retângulo é quadrado!");
        }
        else{
            System.out.println("Esse é um retângulo de fato!");
        }
    }
}
