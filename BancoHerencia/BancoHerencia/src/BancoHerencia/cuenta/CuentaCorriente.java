package BancoHerencia.cuenta;

import BancoHerencia.cliente.Cliente;

import BancoHerencia.Cheque;

public class CuentaCorriente extends Cuenta{
    private Double montoAutorizadoGiroDescubierto;

    public CuentaCorriente(Integer numeroDeCuenta, Cliente unCliente, Double montoAutorizadoGiroDescubierto) {
        super(numeroDeCuenta, unCliente);
        this.montoAutorizadoGiroDescubierto = montoAutorizadoGiroDescubierto;
    }

    public void depositar(Cheque unCheque){

    }

    @Override
    public void extraer(Integer cantidadExtraer) {
        if(saldo>cantidadExtraer){
            System.out.println(saldo);
            super.extraer(cantidadExtraer);
            System.out.println(saldo);
        } else{

        }
    }
}
