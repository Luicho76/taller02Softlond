package Ejercicio01;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private int edad;
    private ArrayList<Double> calificaciones;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(double calificacion) {
        calificaciones.add(calificacion);
    }

    /**
     * @return
     */
    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double calificacion : calificaciones) {
            sum += calificacion;
        }
        return sum / calificaciones.size();
    }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nPromedio de calificaciones: " + calcularPromedio();
    }
}
