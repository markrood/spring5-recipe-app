package rood.mark.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rood.mark.services.RecipeService;

@Controller
public class IndexController{

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        System.out.println("I made it here!!");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}