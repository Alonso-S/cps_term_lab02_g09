package pe.edu.tecsup.lab02;

public class StudentModel {
    private String idEstudiante;
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor
    public StudentModel(String idEstudiante, String nombre, int edad, String carrera) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Getters y Setters
    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante[ID: " + idEstudiante + ", Nombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + "]";
    }
}
