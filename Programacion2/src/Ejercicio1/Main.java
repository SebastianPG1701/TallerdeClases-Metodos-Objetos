package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Ingrese la base del triángulo:");
        double baseTriangulo = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la altura del triángulo:");
        double alturaTriangulo = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese el lado 1 del triángulo:");
        double lado1 = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese el lado 2 del triángulo:");
        double lado2 = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese el lado 3 del triángulo:");
        double lado3 = Double.parseDouble(reader.readLine());

        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, lado1, lado2, lado3);
        System.out.println(triangulo.mostrarInformacion());


        System.out.println("Ingrese el lado del cuadrado:");
        double ladoCuadrado = Double.parseDouble(reader.readLine());

        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
        System.out.println(cuadrado.mostrarInformacion());


        System.out.println("Ingrese la base del rectángulo:");
        double baseRectangulo = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la altura del rectángulo:");
        double alturaRectangulo = Double.parseDouble(reader.readLine());

        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
        System.out.println(rectangulo.mostrarInformacion());
    }
}
