package BancoHerencia;

import BancoHerencia.cliente.Cliente;
import BancoHerencia.cuenta.CuentaCorriente;

public class Main {

    public static void main(String[] args) {
	    CuentaCorriente unaCuentaCorriente = new CuentaCorriente(
	            123,
                new Cliente(132),
                12.0);

        unaCuentaCorriente.depositar(20);
        unaCuentaCorriente.extraer(30);
    }
}
