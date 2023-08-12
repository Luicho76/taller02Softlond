package Ejercicio01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SistemaAlumnos {
    private ArrayList<Alumno> alumnos;

    public SistemaAlumnos() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(String nombre, int edad) {
        Alumno alumno = new Alumno(nombre, edad);
        alumnos.add(alumno);
    }

    public void asignarCalificacion(int indice, double calificacion) {
        if (indice >= 0 && indice < alumnos.size()) {
            alumnos.get(indice).agregarCalificacion(calificacion);
        } else {
            JOptionPane.showMessageDialog(null, "Índice de alumno inválido");
        }
    }

    public void mostrarInformacion(int indice) {
        if (indice >= 0 && indice < alumnos.size()) {
            String informacion = alumnos.get(indice).obtenerInformacion();
            JOptionPane.showMessageDialog(null, informacion);
        } else {
            JOptionPane.showMessageDialog(null, "Índice de alumno inválido");
        }
    }

    public static void main(String[] args) {
        SistemaAlumnos sistema = new SistemaAlumnos();

        sistema.agregarAlumno("Juan", 20);
        sistema.agregarAlumno("María", 21);

        sistema.asignarCalificacion(0, 8.5);
        sistema.asignarCalificacion(0, 9.2);
        sistema.asignarCalificacion(1, 7.8);

        sistema.mostrarInformacion(0);
        sistema.mostrarInformacion(1);
    }
}
