package app.dinnerwinner.api.controllers;

import app.dinnerwinner.api.entitles.Recipe;
import app.dinnerwinner.api.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping()
    public List<Recipe> getList(){
        return recipeService.getAllRecipes();
    }
}
