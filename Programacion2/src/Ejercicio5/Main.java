package Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Ingrese la cédula del empleado:");
        String cedula = reader.readLine();

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = reader.readLine();

        System.out.println("Ingrese el apellido del empleado:");
        String apellido = reader.readLine();

        System.out.println("Ingrese el género del empleado:");
        String genero = reader.readLine();

        System.out.println("Ingrese el salario del empleado:");
        double salario = Double.parseDouble(reader.readLine());

        System.out.println("Ingrese la fecha de nacimiento del empleado (dd/MM/yyyy):");
        LocalDate fechaNacimiento = LocalDate.parse(reader.readLine(), formatter);

        System.out.println("Ingrese la fecha de ingreso del empleado (dd/MM/yyyy):");
        LocalDate fechaIngreso = LocalDate.parse(reader.readLine(), formatter);


        Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);


        System.out.println(empleado.mostrarInformacion());


        System.out.println("¿Desea modificar el salario del empleado? (si/no):");
        String respuesta = reader.readLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el nuevo salario:");
            double nuevoSalario = Double.parseDouble(reader.readLine());
            empleado.modificarSalario(nuevoSalario);
        }


        System.out.println("\nInformación actualizada del empleado:");
        System.out.println(empleado.mostrarInformacion());
    }
}
