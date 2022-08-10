package com.example.springtestinglab2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class BitcoinService {
    Logger logger = LoggerFactory.getLogger(BitcoinService.class);
    public String getBitcoinPrice() {
        String apiURL = "https://api.coincap.io/v2/assets/bitcoin";
        RestTemplate restTemplate = new RestTemplate();

        BitcoinData result = restTemplate.getForObject(apiURL, BitcoinData.class);

        logger.info("Application is displaying bitcoin price as " + result.getData().getPriceUsd());
        return result.getData().getPriceUsd();
    }
}

class Bitcoin {
    private String id;
    private String priceUsd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(String priceUsd) {
        this.priceUsd = priceUsd;
    }
}

class BitcoinData {
    private Bitcoin data;

    public Bitcoin getData() {
        return data;
    }

    public void setData(Bitcoin data) {
        this.data = data;
    }
}