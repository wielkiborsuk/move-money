package com.sda.movemoney;

import com.sda.movemoney.exception.JestesBiednyException;

import java.util.Objects;

public class Osoba {
    private Portfel portfel;

    public Osoba() {
        portfel = new Portfel();
    }

    public boolean czyMaszPortfel() {
        return Objects.nonNull(portfel);
    }

    public void zaplac(Osoba komu, Pieniadze ile) {
        try {
            portfel.wyplac(ile);
            komu.przyjmij(ile);
        } catch(JestesBiednyException e) {
            System.out.println("Zabrakło mi pieniędzy!");
        }
    }

    public void przyjmij(Pieniadze ile) {
        portfel.wplac(ile);
    }
}
