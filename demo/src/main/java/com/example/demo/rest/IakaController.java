package com.example.demo.rest;

import com.example.demo.rest.Iaka;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IakaController {
    private AtomicLong counter = new AtomicLong();

    @RequestMapping("/iaka")
    public Iaka iakaBre() {
        return new Iaka(counter.incrementAndGet(), "Iaka Igori!");
    }
}
