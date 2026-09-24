package revisao.retangulo;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(){
        this.largura = 1;
        this.altura = 1;
    }

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    // Métodos getters
    public void getLargura(double largura){
        this.largura = largura;
    }
    public void getAltura(double altura){
        this.altura = altura;
    }

    // Métodos setters
    public double setLargura(){
        return this.largura;
    }
    public double setAltura(){
        return this.altura;
    }

    //
    public double calculaArea(){
        return this.largura *this.altura;
    }

    public boolean isQuadrado(){
        if(this.largura == this.altura){
            return true;
        }
        else{
            return false;
        }
    }

}
