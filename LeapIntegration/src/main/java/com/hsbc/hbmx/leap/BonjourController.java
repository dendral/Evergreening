package com.hsbc.hbmx.leap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BonjourController {

    @RequestMapping("/hi")
    String home() {
        return "Hello World!";
    }

}
