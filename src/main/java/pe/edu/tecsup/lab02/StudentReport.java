package pe.edu.tecsup.lab02;

public class StudentReport {

    public void mostrarReporteEstudiante(StudentModel estudiante) {
        System.out.println("------- Reporte del Estudiante -------");
        System.out.println("ID: " + estudiante.getIdEstudiante());
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("--------------------------------------");
    }
}

