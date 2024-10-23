package Ejercicio1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Figura {
    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public String mostrarInformacion() {
        return "";
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String mostrarInformacion() {
        return "Triángulo:\n" +
                "Área: " + calcularArea() + "\n" +
                "Perímetro: " + calcularPerimetro();
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String mostrarInformacion() {
        return "Cuadrado:\n" +
                "Área: " + calcularArea() + "\n" +
                "Perímetro: " + calcularPerimetro();
    }
}

class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String mostrarInformacion() {
        return "Rectángulo:\n" +
                "Área: " + calcularArea() + "\n" +
                "Perímetro: " + calcularPerimetro();
    }
}

