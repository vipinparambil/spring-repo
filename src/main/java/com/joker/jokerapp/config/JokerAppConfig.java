package com.joker.jokerapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokerAppConfig {

    @Bean
    public ChuckNorrisQuotes chuckQuotes() {
        return new ChuckNorrisQuotes();
    }
}
