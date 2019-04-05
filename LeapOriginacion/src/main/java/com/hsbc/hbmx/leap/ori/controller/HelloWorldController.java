package com.hsbc.hbmx.leap.ori.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

    @RequestMapping("/originacion")
    String home() {
        return "Leap Originacion is UP";
    }

}
