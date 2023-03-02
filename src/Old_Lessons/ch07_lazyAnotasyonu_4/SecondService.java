package com.turkishjavadeveloper.ch07_lazyAnotasyonu_4;

import org.springframework.stereotype.Service;

@Service
public class SecondService {

    private FirstService firstService;

    public SecondService(FirstService firstService) {
        this.firstService = firstService;
    }
}
