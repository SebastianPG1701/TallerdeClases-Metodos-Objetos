package Ejercicio5;


import java.time.LocalDate;
import java.time.Period;


class Empleado {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;


    public Empleado(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }


    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }


    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }


    public int calcularAntiguedad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaIngreso, fechaActual).getYears();
    }


    public double calcularPrestaciones() {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * salario) / 12;
    }


    public String mostrarInformacion() {
        return "Empleado: " + nombre + " " + apellido + "\n" +
                "Cédula: " + cedula + "\n" +
                "Género: " + genero + "\n" +
                "Salario: " + salario + "\n" +
                "Edad: " + calcularEdad() + " años\n" +
                "Antigüedad: " + calcularAntiguedad() + " años\n" +
                "Prestaciones: " + calcularPrestaciones();
    }
}

