public class Retangulo{
    private final float altura;
    private final float largura;

    public Retangulo(float altura, float largura){
        this.altura = altura;
        this.largura = largura;
    }

    public float getArea(){
        return largura * altura;
    }

    public float getPerimetro(){
        return 2*(largura + altura);
    }

    public float getAltura(){
        return altura;
    }

    public float getLargura(){
        return largura;
    }
}