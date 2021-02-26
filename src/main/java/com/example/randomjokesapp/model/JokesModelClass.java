package com.example.randomjokesapp.model;

public class JokesModelClass {
    private String joke;

    public JokesModelClass(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "JokesModelClass{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
