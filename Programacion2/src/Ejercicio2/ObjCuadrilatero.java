package Ejercicio2;


import javax.swing.*;

public class ObjCuadrilatero {

    int largo, ancho;
    private int resArea, resPerimetro;

    public ObjCuadrilatero()
    {
        JOptionPane.showMessageDialog(null,"Soy el nuevo constructor");
    }

    public ObjCuadrilatero(int largo)
    {
        JOptionPane.showMessageDialog(null,
                "Bienvenidos a mi sistema de Cuadrilatero");
        this.largo = largo;
        this.ancho = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el ancho del cuadrilatero") );
    }

    public void calcularArea()
    {
        resArea = largo * ancho;
    }

    public void calcularPerimetro()
    {
        resPerimetro = largo + largo + ancho + ancho;
    }

    public int getResArea() {
        return resArea;
    }

    public void setResArea(int resArea) {
        this.resArea = resArea;
    }

    public int getResPerimetro() {
        return resPerimetro;
    }
}
