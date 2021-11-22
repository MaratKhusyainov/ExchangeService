package com.exchangeservice.service.interfaces;

import com.exchangeservice.dto.Gif;
import org.springframework.http.ResponseEntity;

public interface GifService {
    ResponseEntity<Gif> getGifResponse(String tag);
}
