package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BehandelingTest {
    @Test
    void moetFactuurOpgemaaktWorden(){
        Assertions.assertFalse(new Behandeling(true,true,false).moetFactuurOpgemaaktWorden());
        Assertions.assertFalse(new Behandeling(true,false,true).moetFactuurOpgemaaktWorden());
        Assertions.assertFalse(new Behandeling(false,true,true).moetFactuurOpgemaaktWorden());
        Assertions.assertTrue(new Behandeling(true,true,true).moetFactuurOpgemaaktWorden());
    }
}