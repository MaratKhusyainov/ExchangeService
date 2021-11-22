package com.exchangeservice.service;

import com.exchangeservice.client.GifClient;
import com.exchangeservice.dto.Gif;
import com.exchangeservice.service.interfaces.GifService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Data
public class GifServiceImpl implements GifService {

    private final GifClient gifClient;

    private final String API_KEY;

    public GifServiceImpl(GifClient gifClient, @Value("${gif.api_key}") String API_KEY) {
        this.gifClient = gifClient;
        this.API_KEY = API_KEY;
    }

    public ResponseEntity<Gif> getGifResponse(String tag) {
        return gifClient.getGif(API_KEY, tag);
    }
}
