package com.hsbc.hbmx.leap.riesgos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

	@RequestMapping("/riesgos")
    String home() {
        return "Leap Riesgos is UP";
    }

}
