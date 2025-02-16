package com.akash.producer.controllers;

import com.akash.producer.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: akash
 * Date: 16/2/25
 */

@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
@RestController
public class WikimediaController {

    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    @GetMapping
    public void startPublishing() {
        wikimediaStreamConsumer.consumeStreamAndPublish();
    }
}
