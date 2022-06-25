package com.patrick.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.patrick.helpdesk.services.DBService;

@Configuration
@Profile("test")

public class TestConfig {

	@Autowired
	private DBService dbService;

    @Bean
    void instanciaDB() {
        this.dbService.instanciaDB();
    }
}
