package pe.edu.tecsup.lab02;

import java.util.Scanner;

public class StudentView {

    private Scanner scanner;

    public StudentView() {
        scanner = new Scanner(System.in);
    }

    public String obtenerIdEstudiante() {
        System.out.print("Ingrese el ID del estudiante: ");
        return scanner.nextLine();
    }

    public String obtenerNombreEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        return scanner.nextLine();
    }

    public int obtenerEdadEstudiante() {
        System.out.print("Ingrese la edad del estudiante: ");
        return scanner.nextInt();
    }

    public String obtenerCarreraEstudiante() {
        System.out.print("Ingrese la carrera del estudiante: ");
        scanner.nextLine(); // Consumir el salto de línea
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
