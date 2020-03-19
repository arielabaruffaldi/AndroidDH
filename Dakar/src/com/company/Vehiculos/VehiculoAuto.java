package com.company.Vehiculos;

public class VehiculoAuto extends Vehiculo{
    public VehiculoAuto(Double velocidad, Double aceleracion, Integer anguloDeGiro, String patente, Double peso, Integer ruedas) {
        super(velocidad, aceleracion, anguloDeGiro, patente, peso, ruedas);
        peso = 1000.0;
        ruedas = 4;
    }
}
