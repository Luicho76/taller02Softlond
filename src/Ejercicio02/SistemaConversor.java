package Ejercicio02;

import javax.swing.JOptionPane;

public class SistemaConversor {
    public static void main(String[] args) {
        double tasaDolarEuro = 0.91; 
        double tasaPesoDolar = 0.00025;
        double tasaBolivarDolar = 0.03125;
        

        ConversorMonedas conversor = new ConversorMonedas(tasaDolarEuro, tasaPesoDolar, tasaBolivarDolar);

        // Obtener la cantidad a convertir
        String inputCantidad = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
        double cantidad = Double.parseDouble(inputCantidad);

        // Obtener la moneda de origen
        String[] monedas = {"Pesos", "Dólares", "Bolívares", "Euros"};
        String monedaOrigen = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione la moneda de origen:",
            "Moneda de Origen",
            JOptionPane.PLAIN_MESSAGE,
            null,
            monedas,
            monedas[0]
        );

        // Obtener la moneda de destino
        String monedaDestino = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione la moneda de destino:",
            "Moneda de Destino",
            JOptionPane.PLAIN_MESSAGE,
            null,
            monedas,
            monedas[1]
        );

        double resultado = 0.0;

        if (monedaOrigen.equals("Pesos")) {
            if (monedaDestino.equals("Dólares")) {
                resultado = conversor.convertirPesoADolar(cantidad);
            } else if (monedaDestino.equals("Euros")) {
                resultado = conversor.convertirPesoAEuro(cantidad);
            }
        } else if (monedaOrigen.equals("Dólares")) {
            if (monedaDestino.equals("Pesos")) {
                resultado = conversor.convertirDolarAPeso(cantidad);
            } else if (monedaDestino.equals("Euros")) {
                resultado = conversor.convertirDolarAEuro(cantidad);
            }
        } else if (monedaOrigen.equals("Bolívares")) {
            if (monedaDestino.equals("Dólares")) {
                resultado = conversor.convertirBolivarADolar(cantidad);
            } else if (monedaDestino.equals("Euros")) {
                resultado = conversor.convertirBolivarAEuro(cantidad);
            }
        }

        String mensaje = "Cantidad convertida: " + resultado + " " + monedaDestino;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
