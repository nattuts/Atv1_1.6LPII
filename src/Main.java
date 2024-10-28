import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a altura do retângulo: ");
        float altura = scanner.nextFloat();

        System.out.print("Qual a largura do retângulo: ");
        float largura = scanner.nextFloat();

        Retangulo retangulo = new Retangulo(altura, largura);

        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Largura: " + retangulo.getLargura());

        System.out.println("Area: " + retangulo.getArea());
        System.out.println("Area: " + retangulo.getPerimetro());


        scanner.close();
    }
}
