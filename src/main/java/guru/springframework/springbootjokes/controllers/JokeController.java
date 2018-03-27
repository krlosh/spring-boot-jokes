package guru.springframework.springbootjokes.controllers;

import guru.springframework.springbootjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokesService;

    public JokeController(JokeService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){
        String joke = this.jokesService.getJoke();
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
