package BancoHerencia.cliente;

public class ClienteIndividual extends Cliente{
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteIndividual(Integer identificador){
        super(identificador);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
