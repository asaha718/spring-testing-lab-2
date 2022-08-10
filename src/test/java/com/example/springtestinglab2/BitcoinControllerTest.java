package com.example.springtestinglab2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BitcoinControllerTest {

    @Test
    void getBitcoinPrice() {
        BitcoinService bitcoinService = Mockito.mock(BitcoinService.class);
        String bitcoinPrice = "12345.67";
        BitcoinController bitcoinController = new BitcoinController();
        when(bitcoinService.getBitcoinPrice()).thenReturn(bitcoinPrice);

        String expected= bitcoinPrice;
        String actual = bitcoinController.getBitcoinPrice();

        assertEquals(expected, actual);
    }
}