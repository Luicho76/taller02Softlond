package Ejercicio03;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        double numero1 = parseInput(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        double numero2 = parseInput(input2);

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        String operacion = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione la operación:",
            "Operación",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        double resultado = 0.0;
        boolean error = false;

        switch (operacion) {
            case "Sumar":
                resultado = numero1 + numero2;
                break;
            case "Restar":
                resultado = numero1 - numero2;
                break;
            case "Multiplicar":
                resultado = numero1 * numero2;
                break;
            case "Dividir":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    error = true;
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
                }
                break;
        }

        if (!error) {
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }

    private static double parseInput(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
            System.exit(1);
        }
        return 0.0;
    }
}
