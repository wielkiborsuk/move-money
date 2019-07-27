package com.sda.movemoney;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PieniadzeTest {

    @ParameterizedTest
    @CsvSource({"7, PLN, true", "10.00000, PLN, true", "25, PLN, false"})
    public void checkCzyCieStac(String kwota, Waluta waluta, boolean result) {
        Pieniadze a = new Pieniadze(BigDecimal.TEN, Waluta.PLN);
        Pieniadze b = new Pieniadze(new BigDecimal(kwota), waluta);

        assertEquals(result, a.czyCieStac(b));
    }

}