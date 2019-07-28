package com.sda.movemoney;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("zaczynamy transakcje");
        Osoba osoba1 = new Osoba("Franciszek");
        Osoba osoba2 = new Osoba("Zenon");

        osoba1.przyjmij(new Pieniadze(BigDecimal.TEN, Waluta.PLN));

        osoba1.audyt();
        osoba2.audyt();

        osoba1.zaplac(osoba2, new Pieniadze(BigDecimal.TEN, Waluta.PLN));

        osoba1.audyt();
        osoba2.audyt();
    }
}
