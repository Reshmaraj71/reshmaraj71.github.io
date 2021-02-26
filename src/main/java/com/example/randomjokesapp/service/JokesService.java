package com.example.randomjokesapp.service;

import com.example.randomjokesapp.entity.RandomJokes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JokesService implements JokeServiceImpl{
    private final RandomJokes randomJokes;

    public JokesService(RandomJokes randomJokes) {
        this.randomJokes = randomJokes;
    }

    @Override
    public String getJoke() {

        return randomJokes.getRandomJokes();
    }


}
