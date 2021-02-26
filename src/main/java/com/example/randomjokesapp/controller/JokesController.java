package com.example.randomjokesapp.controller;


import com.example.randomjokesapp.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/joke")
public class JokesController {
    private JokesService jokeService;
    @Autowired
    public String myController(@ModelAttribute("joke") Model model) {
        jokeService.getJoke();
        return "index";
    }
}
