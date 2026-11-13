package com.example;
public class Fruta {
    private String nombre;
    private String color;
    private double peso;
    private double precioBase;
    private boolean organica;
    private int diasMaduracion;

    public Fruta(String nombre, String color, double peso, double precioBase, boolean organica, int diasMaduracion) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.precioBase = precioBase;
        this.organica = organica;
        this.diasMaduracion = diasMaduracion;
    }

    public double calcularPrecioFinal() {
        double precio = this.precioBase;
        if (organica) {
            precio *= 1.20; 
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Fruta(" + nombre + ", Color: " + color + ", Peso: " + peso + "g, Orgánica: " + (organica ? "Si" : "No") + ")";
    }

    public double getPrecioBase() { return precioBase; }
    public int getDiasMaduracion() { return diasMaduracion; }
}