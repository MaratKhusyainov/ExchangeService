package com.exchangeservice.service;

import com.exchangeservice.client.CurrencyClient;
import com.exchangeservice.dto.Currency;
import com.exchangeservice.service.interfaces.CurrencyService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Data
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyClient currencyClient;

    private final String API_KEY;

    public CurrencyServiceImpl(CurrencyClient currencyClient, @Value("${currency.api_key}") String API_KEY) {
        this.currencyClient = currencyClient;
        this.API_KEY = API_KEY;
    }

    public ResponseEntity<Currency> getCurrency(String date, String base) {
        return currencyClient.getCurrency(date, API_KEY, base);
    }
}
