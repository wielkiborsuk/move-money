package com.sda.movemoney;

import java.math.BigDecimal;

public class Pieniadze {

    private BigDecimal kwota;
    private Waluta waluta;

    public Pieniadze(BigDecimal kwotaPoczatkowa) {
        this.kwota = kwotaPoczatkowa;
        this.waluta = Waluta.PLN;
    }

    public Pieniadze przyjmijPieniadze(Pieniadze pieniadz) {

        return null;
    }

    public Pieniadze pobierzPieniadze(Pieniadze pieniadz) {

        return null;
    }

    public boolean czyCieStac(Pieniadze pieniadz) {
        return true;
    }
}
