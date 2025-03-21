package AreaDeDoisTriangulos.application;// nome da pasta onde está a classe Program.

import java.util.Locale;//usar ponto no lugar da virgula para casas decimais.
import java.util.Scanner;
import AreaDeDoisTriangulos.entities.Triangle;// Importa a classe Triangle do pacote entities.

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//usar ponto no lugar da virgula para casas decimais.
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();// Cria um objeto da classe Triangle.
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.setA(sc.nextDouble());// Atribui o valor digitado pelo usuário ao atributo a do objeto x.
        x.setB(sc.nextDouble());
        x.setC(sc.nextDouble());

        System.out.println("Enter the measures of triangle Y: ");
        y.setA(sc.nextDouble());// Atribui o valor digitado pelo usuário ao atributo a do objeto y.
        y.setB(sc.nextDouble());
        y.setC(sc.nextDouble());

        double areaX = x.area();// Chama o método area do objeto x.
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {//compara qual e o maior.
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}