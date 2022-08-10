package com.example.springtestinglab2;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CryptoService {
    public String geCryptoPrice(String crypto) {
        String apiURL = "https://api.coincap.io/v2/assets/" + crypto;
        RestTemplate restTemplate = new RestTemplate();

        Data result = restTemplate.getForObject(apiURL, Data.class);
        return result.getData().getPriceUsd();
    }
}
class Crypto {
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

class Data {
    private Crypto data;

    public Crypto getData() {
        return data;
    }

    public void setData(Crypto data) {
        this.data = data;
    }
}