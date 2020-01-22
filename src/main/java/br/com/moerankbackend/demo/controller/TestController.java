package br.com.moerankbackend.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public Mono<ResponseEntity<String>> helloWorld() {
        log.info("request to Hello World");

        return Mono
                .just(ResponseEntity
                .ok("Hello world"));
    }

}
