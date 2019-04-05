package com.hsbc.hbmx.leap.ori;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LeapOriginacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeapOriginacionApplication.class, args);
	}

	/* TODO esto hay que quitarlo de aqui*/
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
