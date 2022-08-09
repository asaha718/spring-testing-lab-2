package com.example.springtestinglab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitcoinController {
    private BitcoinService bitcoinService;

    public BitcoinController(BitcoinService bitcoinService) {
        this.bitcoinService = bitcoinService;
    }

    @GetMapping("/bitprice")
    public String getBitcoinPrice() {
        return bitcoinService.getBitcoinPrice();
    }

}
