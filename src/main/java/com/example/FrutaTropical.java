package com.example;

public class FrutaTropical extends Fruta {
    private double temperaturaIdeal; // °C
    private double nivelDulzura;     // escala 0-25

    public FrutaTropical(String nombre, String color, double peso, double precioBase, boolean esOrganica,
                         int diasMaduracion, double temperaturaIdeal, double nivelDulzura) {
        super(nombre, color, peso, precioBase, esOrganica, diasMaduracion);
        this.temperaturaIdeal = temperaturaIdeal;
        this.nivelDulzura = nivelDulzura;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = super.calcularPrecioFinal();
        // Las frutas tropicales muy dulces llevan un recargo
        if (nivelDulzura > 15.0) {
            return precio * 1.10;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tropical, Temp. Ideal: " + temperaturaIdeal
                + "°C, Dulzura: " + nivelDulzura;
    }
}