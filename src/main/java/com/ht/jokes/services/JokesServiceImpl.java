package com.ht.jokes.services;

import com.ht.jokes.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {
    @Override
    public Joke getRandomJoke() {
        return new Joke(new ChuckNorrisQuotes().getRandomQuote());
    }
}
