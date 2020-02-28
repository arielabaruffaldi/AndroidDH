import java.util.Date;

public class Prestamo {
    private Ejemplar ejemplar;
    private Socio socio;
    private Date fecha;

    public Prestamo(Ejemplar ejemplar, Socio socio, Date fecha) {
        this.ejemplar = ejemplar;
        this.socio = socio;
        fecha = new Date();
    }

}
