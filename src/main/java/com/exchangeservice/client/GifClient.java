package com.exchangeservice.client;

import com.exchangeservice.dto.Gif;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "gif-client", url = "${gif.url}")
public interface GifClient {
    @GetMapping(value = "/random")
    ResponseEntity<Gif> getGif(@RequestParam("api_key") String api_key,
                               @RequestParam("tag") String tag);
}
