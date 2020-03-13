public class EmpleadoVajilla extends Empleado {
    private Integer vajillaRota;

    public EmpleadoVajilla(Double sueldo, String nombre, String apellido, Integer legajo, Integer vajillaRota) {
        super(sueldo, nombre, apellido, legajo);
        this.vajillaRota = vajillaRota;
    }

    @Override
    public void cobrar() {

    }
}
