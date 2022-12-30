package com.ht.jokes.controller;

import com.ht.jokes.model.Joke;
import com.ht.jokes.services.JokesService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jkService;

    public JokesController(JokesService jkService) {
        this.jkService = jkService;
    }

    @RequestMapping("/getJoke")
    public String getJoke(Model model){
        Joke jk = jkService.getRandomJoke();

        model.addAttribute("jk", jk);

        return "index";
    }
}
