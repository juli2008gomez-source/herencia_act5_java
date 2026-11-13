package com.example;

public class FrutaDeHueso extends Fruta {
    private double tamanioHueso;
    private boolean cascaraDura;

    public FrutaDeHueso(String nombre, String color, double peso, double precioBase, boolean esOrganica,
                        int diasMaduracion, double tamanioHueso, boolean cascaraDura) {
        super(nombre, color, peso, precioBase, esOrganica, diasMaduracion); // FIX
        this.tamanioHueso = tamanioHueso;
        this.cascaraDura = cascaraDura;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = super.calcularPrecioFinal();
        if (this.tamanioHueso > 3.0) {
            return precio * 0.90;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + " -> De Hueso, Tamaño Hueso: " + tamanioHueso
                + "cm, Cáscara Dura: " + (cascaraDura ? "Sí" : "No");
    }
}