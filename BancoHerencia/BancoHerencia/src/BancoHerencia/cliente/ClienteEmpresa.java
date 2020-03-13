package BancoHerencia.cliente;

public class ClienteEmpresa extends Cliente {
    private String nombreFantasia;
    private String cuit;
    public ClienteEmpresa(Integer identificador, String nombreFantasia, String cuit) {
        super(identificador);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }
}
