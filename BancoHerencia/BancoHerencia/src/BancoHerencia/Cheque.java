package BancoHerencia;

public class Cheque {
    private Double monto;
    private String banco;
    private String fecha;

    public Cheque(Double monto, String banco, String fecha) {
        this.monto = monto;
        this.banco = banco;
        this.fecha = fecha;
    }
}
