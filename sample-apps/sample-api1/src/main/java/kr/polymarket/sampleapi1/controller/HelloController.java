package kr.polymarket.sampleapi1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/")
    public Mono<String> hello1() {
        return Mono.just("Hello World 1 This is a Test");
    }

}
