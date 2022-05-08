package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactuurTest {
    @Test
    void testberekenPrijsExBTW(){
        Factuur factuur = new Factuur(0);
        Assertions.assertEquals(factuur.berekenPrijsExBTW(0),0);
        Assertions.assertEquals(factuur.berekenPrijsExBTW(1),750);
        Assertions.assertEquals(factuur.berekenPrijsExBTW(10),750);
        Assertions.assertEquals(factuur.berekenPrijsExBTW(24),1800);
        Assertions.assertEquals(factuur.berekenPrijsExBTW(25),1750);
        Assertions.assertEquals(factuur.berekenPrijsExBTW(26),1820);
    }
}