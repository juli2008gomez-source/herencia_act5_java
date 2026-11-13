package com.example;

public class FrutaCitrica extends Fruta {
    private double nivelAcidez;
    private boolean semillas;

    public FrutaCitrica(String nombre, String color, double peso, double precioBase, boolean esOrganica,
                        int diasMaduracion, double nivelAcidez, boolean tieneSemillas) {
        super(nombre, color, peso, precioBase, esOrganica, diasMaduracion);
        this.nivelAcidez = nivelAcidez;
        this.semillas = tieneSemillas;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = super.calcularPrecioFinal();
        if (getDiasMaduracion() > 5) {
            return precio * 0.85;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Cítrica, Acidez: " + nivelAcidez + "%, Semillas: " + (semillas ? "Sí" : "No");
    }
}