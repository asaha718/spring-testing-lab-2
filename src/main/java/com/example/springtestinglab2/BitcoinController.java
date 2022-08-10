package com.example.springtestinglab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class BitcoinController {
    Logger logger = LoggerFactory.getLogger(BitcoinService.class);
    private BitcoinService bitcoinService;

    public BitcoinController(BitcoinService bitcoinService) {
        this.bitcoinService = bitcoinService;
    }

    @GetMapping("/bitprice")
    public String getBitcoinPrice() {
        logger.trace("Application is fetching bitcoin information");
        return bitcoinService.getBitcoinPrice();
    }

}
