package BancoHerencia.cuenta;

import BancoHerencia.cliente.Cliente;

public class CuentaCajaDeAhorro extends Cuenta{
    private Double tasaDeInteres;
    public CuentaCajaDeAhorro(Integer numeroDeCuenta, Cliente unCliente, Double tasaDeInteres) {
        super(numeroDeCuenta, unCliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    public Double cobraIntereses(){
        Double porcentaje = (saldo * tasaDeInteres) / 100;
        saldo = saldo + porcentaje;
        System.out.println("el saldo ahora es: " + saldo);
        return saldo;
    }
}
