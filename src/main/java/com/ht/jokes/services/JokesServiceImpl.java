package com.ht.jokes.services;

import com.ht.jokes.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quotesService;

    public JokesServiceImpl() {
        this.quotesService = new ChuckNorrisQuotes();
    }

    @Override
    public Joke getRandomJoke() {
        return new Joke(quotesService.getRandomQuote());
    }
}
