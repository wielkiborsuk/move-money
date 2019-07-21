package com.sda.movemoney;

import com.sda.movemoney.exception.JestesBiednyException;

import java.math.BigDecimal;

import static java.lang.String.format;

public class Pieniadze {

    private BigDecimal kwota;
    private Waluta waluta;

    public Pieniadze(BigDecimal kwotaPoczatkowa) {
        this.kwota = kwotaPoczatkowa;
        this.waluta = Waluta.PLN;
    }

    public Pieniadze przyjmijPieniadze(Pieniadze pieniadz) {
        kwota = kwota.add(pieniadz.kwota);
        return new Pieniadze(kwota);
    }

    public Pieniadze pobierzPieniadze(Pieniadze pieniadz) throws JestesBiednyException {
        if (!czyCieStac(pieniadz)) {
            throw new JestesBiednyException();
        }
        kwota = kwota.subtract(pieniadz.kwota);
        return new Pieniadze(kwota);
    }

    public boolean czyCieStac(Pieniadze pieniadz) {
        return kwota.compareTo(pieniadz.kwota) >= 0;
    }

    public String toString() {
        return format("%.2f %s", kwota, waluta);
    }
}
