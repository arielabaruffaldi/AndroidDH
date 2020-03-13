package BancoHerencia.cuenta;

import BancoHerencia.cliente.Cliente;

public abstract class Cuenta {
    private Integer numeroDeCuenta;
    protected Double saldo;
    private Cliente unCliente;

    public Cuenta (Integer numeroDeCuenta, Cliente unCliente){
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 0.0;
        unCliente = this.unCliente;
    }

    public void extraer(Integer cantidadExtraer){
        saldo = saldo - cantidadExtraer;
    }
    public void depositar(Integer cantidadDepositar){
        saldo = saldo + cantidadDepositar;
    }
}
