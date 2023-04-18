package app.dinnerwinner.api.recipe.controllers;

import app.dinnerwinner.api.recipe.entitles.Recipe;
import app.dinnerwinner.api.recipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recipe")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping()
    public List<Recipe> getList(){
        return recipeService.getAllRecipes();
    }

    @PostMapping
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.createRecipe(recipe);
    }
}
