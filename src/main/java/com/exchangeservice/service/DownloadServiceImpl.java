package com.exchangeservice.service;

import com.exchangeservice.client.DownloadClient;
import com.exchangeservice.service.interfaces.DownloadService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;

@Service
@Data
public class DownloadServiceImpl implements DownloadService {
    private final DownloadClient downloadClient;

    @Override
    public ResponseEntity<byte[]> getGifByUrl(URI uri) {
        return downloadClient.getGifByUrl(uri);
    }

}
