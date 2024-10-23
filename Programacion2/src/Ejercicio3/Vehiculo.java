package Ejercicio3;


class Vehiculo {

    private String numeroMotor;
    private int numeroVentanas;
    private int numeroPuertas;
    private String marca;
    private String modelo;
    private double kilometrajeInicial;
    private double kilometrajeFinal;


    public Vehiculo(String numeroMotor, int numeroVentanas, int numeroPuertas, String marca, String modelo, double kilometrajeInicial, double kilometrajeFinal) {
        this.numeroMotor = numeroMotor;
        this.numeroVentanas = numeroVentanas;
        this.numeroPuertas = numeroPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrajeInicial = kilometrajeInicial;
        this.kilometrajeFinal = kilometrajeFinal;
    }


    public double calcularKilometrosRecorridos() {
        return kilometrajeFinal - kilometrajeInicial;
    }


    public String mostrarInformacion() {
        return "Número de Motor: " + numeroMotor + "\n" +
                "Número de Ventanas: " + numeroVentanas + "\n" +
                "Número de Puertas: " + numeroPuertas + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Kilometraje Inicial: " + kilometrajeInicial + "\n" +
                "Kilometraje Final: " + kilometrajeFinal + "\n" +
                "Kilómetros Recorridos: " + calcularKilometrosRecorridos();
    }
}

