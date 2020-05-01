package com.joker.jokerapp.controller;

import com.joker.jokerapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", ""})
    public String getJokes(Model model) {
        model.addAttribute("joke", jokeService.getJokes());
        return "joke";
    }
}
