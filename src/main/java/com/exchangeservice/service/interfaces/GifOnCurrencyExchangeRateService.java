package com.exchangeservice.service.interfaces;

import org.springframework.http.ResponseEntity;

public interface GifOnCurrencyExchangeRateService {
    ResponseEntity<byte[]> getGifByCurrency(String base);
}
