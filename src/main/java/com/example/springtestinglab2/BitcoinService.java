package com.example.springtestinglab2;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinService {
    public String getBitcoinPrice() {
        String apiURL = "https://api.coincap.io/v2/assets/bitcoin";
        RestTemplate restTemplate = new RestTemplate();

        BitcoinData result = restTemplate.getForObject(apiURL, BitcoinData.class);
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