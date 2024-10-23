package Ejercicio3;



import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String numeroMotor = JOptionPane.showInputDialog("Ingrese el número de motor:");
        int numeroVentanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ventanas:"));
        int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas:"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        double kilometrajeInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje inicial:"));
        double kilometrajeFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje final:"));


        Vehiculo vehiculo = new Vehiculo(numeroMotor, numeroVentanas, numeroPuertas, marca, modelo, kilometrajeInicial, kilometrajeFinal);


        JOptionPane.showMessageDialog(null, vehiculo.mostrarInformacion());
    }
}