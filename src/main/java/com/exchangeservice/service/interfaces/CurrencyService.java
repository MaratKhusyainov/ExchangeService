package com.exchangeservice.service.interfaces;

import com.exchangeservice.dto.Currency;
import org.springframework.http.ResponseEntity;

public interface CurrencyService {
    ResponseEntity<Currency> getCurrency(String date, String base);
}
