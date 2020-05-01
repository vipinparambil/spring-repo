package com.joker.jokerapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckQuotes;

    public JokeServiceImpl() {
        this.chuckQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        return chuckQuotes.getRandomQuote();
    }
}

