package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private Map<Integer, List<Prenda>> prendas;
    private Integer contador;

    public GuardaRopa() {
        prendas = new HashMap<>();
        contador = 0;
    }


    public Integer guardarPrendas (List<Prenda>listaDePrenda){
        Integer nroIdentificacion = contador;
        prendas.put(nroIdentificacion, listaDePrenda);
        contador ++;
        return contador;
    }

    public void mostrarPrendas(){
        for(Integer key: prendas.keySet()){
            System.out.println("la key es: " + key + "y la prenda es: " + prendas.get(key).toString() );
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        List<Prenda> prendaDevolver = prendas.get(numero);
        return prendaDevolver;
    }
}
