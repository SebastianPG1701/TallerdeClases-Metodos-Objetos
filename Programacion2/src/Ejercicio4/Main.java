package Ejercicio4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Ingrese el nombre del producto:");
        String nombre = reader.readLine();

        System.out.println("Ingrese el precio del producto:");
        double precio = Double.parseDouble(reader.readLine());

        System.out.println("¿El producto tiene IVA? (si/no):");
        String tieneIVAInput = reader.readLine();
        boolean tieneIVA = tieneIVAInput.equalsIgnoreCase("si");


        Producto producto = new Producto(nombre, precio, tieneIVA);


        System.out.println(producto.mostrarInformacion());
    }
}