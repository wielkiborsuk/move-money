package com.sda.movemoney;

import com.sda.movemoney.exception.JestesBiednyException;

import java.math.BigDecimal;

import static java.lang.String.format;

public class Portfel {
    private Pieniadze zlotowki;

    public Portfel() {
        zlotowki = new Pieniadze(BigDecimal.ZERO);
    }

    public void wplac(Pieniadze ile) {
        zlotowki.przyjmijPieniadze(ile);
    }

    public void wyplac(Pieniadze ile) throws JestesBiednyException {
        zlotowki.pobierzPieniadze(ile);
    }

    public String saldo() {
        return format("W portfelu jest: %s", zlotowki);
    }
}
