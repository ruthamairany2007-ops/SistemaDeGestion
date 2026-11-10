package com.mycompany.sistemadegestion;

/**
 *
 * @author ruth
 */
public class Gestor {
    public String nombreArticulo;
    public double precioUnitario;
    public int cantidadStock;

    public void procesarActu(String n, double p, int cantNueva, double descuento) {
        nombreArticulo = n;
        precioUnitario = p;
        cantidadStock = cantNueva;
        
        double subtotal = cantidadStock * precioUnitario;
        double totalConDescuento = subtotal - (subtotal * (descuento / 100.0));
        
        System.out.println("Articulo: " + nombreArticulo + " | Stock: " + cantidadStock);
        System.out.println("Total inventario valorizado: $" + totalConDescuento);
    }
}
