package com.example;

public class Main {
    public static void main(String[] args) {
        int diasLote = 7;

        Fruta[] lote = new Fruta[] {
            new FrutaCitrica("Limón Tahití", "Verde", 50.0, 500, true, diasLote, 4.5, true),
            new FrutaTropical("Mango de Azúcar", "Amarillo", 300.0, 1500, false, 3, 18.5, 2.5),
            new FrutaDeHueso("Durazno", "Naranja", 120.0, 800, true, 4, 3.5, false)
        };

        for (int i = 0; i < lote.length; i++) {
            System.out.println(lote[i].toString());
            System.out.println("Precio final calculado: $" + lote[i].calcularPrecioFinal());
            System.out.println("=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=");
        }
    }
}