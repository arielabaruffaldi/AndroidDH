package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Prenda unaPrenda = new Prenda("Adidas", "Algo");
        Prenda otraPrenda = new Prenda("Nike", "Air");
        System.out.println("acaaa");
        System.out.println(otraPrenda);
        List<Prenda> misPrendas = new ArrayList<>();
        misPrendas.add(unaPrenda);
        misPrendas.add(otraPrenda);


        Prenda Prenda3 = new Prenda("asdf", "asd");
        Prenda Prenda4 = new Prenda("123", "123");
        List<Prenda> misPrendas2 = new ArrayList<>();
        misPrendas2.add(Prenda3);
        misPrendas2.add(Prenda4);


        GuardaRopa guardaRopa = new GuardaRopa();
        System.out.println("las prendas guardadas son del ticket: " + guardaRopa.guardarPrendas(misPrendas));

        System.out.println("las prendas guardadas son del ticket: " + guardaRopa.guardarPrendas(misPrendas2));
    }
}
