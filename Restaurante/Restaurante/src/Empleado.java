public class Empleado {
    private Double sueldo;
    private String nombre;
    private String apellido;
    private Integer legajo;

    public Empleado(Double sueldo, String nombre, String apellido, Integer legajo) {
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public void cobrar(){
        sueldo = sueldo + 500;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }
}
