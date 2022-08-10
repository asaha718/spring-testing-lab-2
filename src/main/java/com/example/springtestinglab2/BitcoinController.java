package com.example.springtestinglab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crypto")
public class BitcoinController {
    @Autowired
    private BitcoinService bitcoinService;

    @Autowired
    private CryptoService cryptoService;

    @GetMapping("/bitprice")
    public String getBitcoinPrice() {
        return bitcoinService.getBitcoinPrice();
    }

    @GetMapping("/{cryptoName}")
    public String getCryptoPrice(@PathVariable String cryptoName){
        return cryptoService.geCryptoPrice(cryptoName);
    }

}
