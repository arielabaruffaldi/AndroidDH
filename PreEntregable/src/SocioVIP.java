public class SocioVIP extends Socio {
    private Integer cuotaMensual;


    public SocioVIP(String nombre, String apellido, Integer numeroDeIdentificacion, Integer cantidadMaximaDeLibrosARetirar) {
        super(nombre, apellido, numeroDeIdentificacion, 15);
    }
}
